package org.example;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Triangle triangle = new Triangle();

        Print.getTitle();
        triangle.setParam();

        Print.getTitle();
        Print.side(triangle);

        System.out.println();
        triangle.getBisector();
        triangle.reset();


        for (;;){
            System.out.println();
            Print.menu(menu);

            if (Menu.getChoice() == 2) {
                break;
            }

            Print.getTitle();
            triangle.setParam();

            Print.getTitle();
            Print.side(triangle);

            System.out.println();
            triangle.getBisector();
        }
    }


}