package com.litmus;

import java.util.Arrays;

public class TheArrays {
    public  static  void  main(String[] args){
        String[] colors = new String[5];
        colors[0] = "proper";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[3 ]);

        int[] numbers = {100, 200};
        String[] newColors = {"blue", "yellow", "Red", "Green", "pink"};
        System.out.println(numbers[0]);
        for (int i = 0; i < colors.length ; i++) {
            colors[i] = newColors[i];
            System.out.println(colors[i]);
        }

//        for (int i = colors.length -1; i >=0  ; i--) {
//            colors[i] = newColors[i];
//            System.out.println(colors[i]);
//            System.out.printf("color1", colors);
//            System.out.printf("newColor2", newColors);
//        }
        for (String color : colors){
            System.out.println(color);
        }
        System.out.println("Enhanced for loop");
        Arrays.stream(colors).forEach(System.out::println);
        
    }
}
