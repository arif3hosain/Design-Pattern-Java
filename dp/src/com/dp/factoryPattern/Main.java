
package com.dp.factoryPattern;

public class Main {
 static FactoryManager fm=new FactoryManager();
 static Color color;
    public static void main(String[] args) {
        
        color=fm.getColorInstance("white");
        System.out.println(color.getColor());
    }
}
