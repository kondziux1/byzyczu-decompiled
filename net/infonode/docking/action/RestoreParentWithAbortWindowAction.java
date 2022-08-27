package net.infonode.docking.action;

import java.io.ObjectStreamException;
import javax.swing.Icon;
import net.infonode.docking.DockingWindow;
import net.infonode.docking.OperationAbortedException;
import net.infonode.docking.TabWindow;
import net.infonode.docking.util.DockingUtil;
import net.infonode.gui.icon.button.RestoreIcon;

public final class RestoreParentWithAbortWindowAction extends DockingWindowAction {
   private static final long serialVersionUID = 1L;
   public static final RestoreParentWithAbortWindowAction INSTANCE = new RestoreParentWithAbortWindowAction();
   private static final Icon icon = new RestoreIcon(10);

   private RestoreParentWithAbortWindowAction() {
      super();
   }

   public String getName() {
      return "Restore";
   }

   public boolean isPerformable(DockingWindow var1) {
      if (var1.isMinimized() && var1.isRestorable()) {
         return true;
      } else {
         TabWindow var2 = DockingUtil.getTabWindowFor(var1);
         return var2 != null && var2.isMaximized() && var2.isRestorable();
      }
   }

   public void perform(DockingWindow var1) {
      if (var1 != null && var1.isMinimized()) {
         restore(var1);
      } else {
         TabWindow var2 = DockingUtil.getTabWindowFor(var1);
         if (var2 != null && var2.isMaximized()) {
            restore(var2);
         }
      }

   }

   public Icon getIcon() {
      return icon;
   }

   private static void restore(DockingWindow var0) {
      try {
         if (var0 != null && var0.isRestorable()) {
            var0.restoreWithAbort();
         }
      } catch (OperationAbortedException var2) {
      }

   }

   protected Object readResolve() throws ObjectStreamException {
      return INSTANCE;
   }
}
