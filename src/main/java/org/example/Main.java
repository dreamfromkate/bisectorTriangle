package org.example;

import org.example.enums.Constants;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Triangle triangle = new Triangle();

        menu.getTitle();

        triangle.setFirstSide(menu.getSetSide(Constants.SET_FIRST_SIDE));
        triangle.setSecondSide(menu.getSetSide(Constants.SET_SECOND_SIDE));
        triangle.setThirdSide(menu.getSetSide(Constants.SET_THIRD_SIDE));

        menu.getTitle();
        System.out.println(triangle);
        System.out.println(triangle.getBisector());

        while (!menu.getChoice()) {
            menu.getTitle();
            triangle.reset();

            triangle.setFirstSide(menu.getSetSide(Constants.SET_FIRST_SIDE));
            triangle.setSecondSide(menu.getSetSide(Constants.SET_SECOND_SIDE));
            triangle.setThirdSide(menu.getSetSide(Constants.SET_THIRD_SIDE));

            menu.getTitle();
            System.out.println(triangle);
            System.out.println(triangle.getBisector());
        }
    }


}