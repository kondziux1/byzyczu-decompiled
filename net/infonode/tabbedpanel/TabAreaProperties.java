package net.infonode.tabbedpanel;

import net.infonode.gui.hover.HoverListener;
import net.infonode.properties.gui.util.ComponentProperties;
import net.infonode.properties.gui.util.ShapedPanelProperties;
import net.infonode.properties.propertymap.PropertyMap;
import net.infonode.properties.propertymap.PropertyMapContainer;
import net.infonode.properties.propertymap.PropertyMapFactory;
import net.infonode.properties.propertymap.PropertyMapGroup;
import net.infonode.properties.propertymap.PropertyMapProperty;
import net.infonode.properties.propertymap.PropertyMapValueHandler;
import net.infonode.properties.types.HoverListenerProperty;

public class TabAreaProperties extends PropertyMapContainer {
   public static final PropertyMapGroup PROPERTIES = new PropertyMapGroup("Tab Area Properties", "Properties for the TabbedPanel class.");
   public static final PropertyMapProperty COMPONENT_PROPERTIES = new PropertyMapProperty(
      PROPERTIES, "Component Properties", "Properties for tab area component.", ComponentProperties.PROPERTIES
   );
   public static final PropertyMapProperty SHAPED_PANEL_PROPERTIES = new PropertyMapProperty(
      PROPERTIES, "Shaped Panel Properties", "Properties for shaped tab area.", ShapedPanelProperties.PROPERTIES
   );
   public static final HoverListenerProperty HOVER_LISTENER = new HoverListenerProperty(
      PROPERTIES,
      "Hover Listener",
      "Hover Listener to be used for tracking mouse hovering over the tab area components area.",
      PropertyMapValueHandler.INSTANCE
   );
   public static final TabAreaVisiblePolicyProperty TAB_AREA_VISIBLE_POLICY = new TabAreaVisiblePolicyProperty(
      PROPERTIES, "Visible Policy", "Visiblity for the tab area.", PropertyMapValueHandler.INSTANCE
   );

   public TabAreaProperties() {
      super(PROPERTIES);
   }

   public TabAreaProperties(PropertyMap var1) {
      super(var1);
   }

   public TabAreaProperties(TabAreaProperties var1) {
      super(PropertyMapFactory.create(var1.getMap()));
   }

   public TabAreaProperties addSuperObject(TabAreaProperties var1) {
      this.getMap().addSuperMap(var1.getMap());
      return this;
   }

   public TabAreaProperties removeSuperObject() {
      this.getMap().removeSuperMap();
      return this;
   }

   public TabAreaProperties removeSuperObject(TabAreaProperties var1) {
      this.getMap().removeSuperMap(var1.getMap());
      return this;
   }

   public ComponentProperties getComponentProperties() {
      return new ComponentProperties(COMPONENT_PROPERTIES.get(this.getMap()));
   }

   public ShapedPanelProperties getShapedPanelProperties() {
      return new ShapedPanelProperties(SHAPED_PANEL_PROPERTIES.get(this.getMap()));
   }

   public TabAreaProperties setHoverListener(HoverListener var1) {
      HOVER_LISTENER.set(this.getMap(), var1);
      return this;
   }

   public HoverListener getHoverListener() {
      return HOVER_LISTENER.get(this.getMap());
   }

   public TabAreaProperties setTabAreaVisiblePolicy(TabAreaVisiblePolicy var1) {
      TAB_AREA_VISIBLE_POLICY.set(this.getMap(), var1);
      return this;
   }

   public TabAreaVisiblePolicy getTabAreaVisiblePolicy() {
      return TAB_AREA_VISIBLE_POLICY.get(this.getMap());
   }
}
