package net.infonode.docking;

class DockingWindow$7 implements Runnable {
   DockingWindow$7(DockingWindow var1) {
      super();
      this.this$0 = var1;
   }

   public void run() {
      DockingWindow.access$100(this.this$0).removeChildWindow(this.this$0);
   }
}
