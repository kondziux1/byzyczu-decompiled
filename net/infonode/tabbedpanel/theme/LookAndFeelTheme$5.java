package net.infonode.tabbedpanel.theme;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import net.infonode.gui.componentpainter.ComponentPainter;
import net.infonode.tabbedpanel.TabbedUtils;
import net.infonode.util.Direction;

class LookAndFeelTheme$5 implements ComponentPainter {
   LookAndFeelTheme$5(LookAndFeelTheme$3 var1) {
      super();
      this.this$1 = var1;
   }

   public void paint(Component var1, Graphics var2, int var3, int var4, int var5, int var6) {
   }

   public void paint(Component var1, Graphics var2, int var3, int var4, int var5, int var6, Direction var7, boolean var8, boolean var9) {
      LookAndFeelTheme.access$300().paintTabArea(TabbedUtils.getParentTabbedPanel(var1), var2, var3, var4, var5, var6);
   }

   public boolean isOpaque(Component var1) {
      return false;
   }

   public Color getColor(Component var1) {
      return null;
   }
}
