package org.example;

import java.util.Scanner;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(){

    }

    public void setParam(){
        this.firstSide = setSide("первой");
        this.secondSide = setSide("второй");
        this.thirdSide = setSide("третьей");
    }

    public void reset(){
        this.firstSide = 0;
        this.secondSide = 0;
        this.thirdSide = 0;
    }

    public int getFirstSide() {
        return firstSide;
    }
    public int getSecondSide() {
        return secondSide;
    }
    public int getThirdSide() {
        return thirdSide;
    }

    public void getBisector(){
        if (condiction()) {
            System.out.println("Длина биссектрисы = " + String.format("%.2f", bisector()));
        }
        else {
            System.out.println("Треугольника с такими сторонами не существует! Попробуйте еще раз");
        }
    }

    private static int setSide (String side){
        Scanner scanner = new Scanner(System.in);

        // Считываем целое число
        System.out.print("Введите длину "+ side + " стороны треугольника: ");
        int intValue = scanner.nextInt();

        // Закрываем сканер
        //scanner.close();

        return intValue;
    }

    private boolean condiction(){
        if (this.firstSide > 0)
            if (this.secondSide > 0)
                if (this.thirdSide > 0)
                    if (this.firstSide + this.secondSide > this.thirdSide)
                        if (this.thirdSide + this.secondSide > this.firstSide)
                            if (this.firstSide + this.thirdSide > this.secondSide)
                                return true;
        return false;
    }

    private double bisector() {
        return Math.sqrt(
                (double) (this.firstSide * this.secondSide * (this.firstSide + this.secondSide + this.thirdSide)
                        * (this.firstSide + this.secondSide - this.thirdSide))
                        /(this.firstSide + this.thirdSide)
        );
    }

}
