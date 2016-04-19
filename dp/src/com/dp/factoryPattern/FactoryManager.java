
package com.dp.factoryPattern;

public class FactoryManager  {
    
   private String colorName;
   Color color=null;
    
    public Color getColorInstance(String colorName){
        if(colorName.equalsIgnoreCase("blue"))
          return color=new Blue();                 
        else if(colorName.equalsIgnoreCase("white"))
          return color=new White();
        else if(colorName.equalsIgnoreCase("black"))
          return color=new Black();
        return null;
    }
    
}
