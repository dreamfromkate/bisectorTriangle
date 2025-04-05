package org.example;

import java.util.Scanner;

public class Menu {

    private String repeat;
    private String endProg;

    public Menu(){
        this.repeat = "1 - Повторить";
        this.endProg = "2 - Завершить программу";
    }

    public String getRepeat(){
        return this.repeat;
    }

    public String getEndProg(){
        return this.endProg;
    }

    public static int getChoice(){
        Scanner scanner = new Scanner(System.in);

        // Считываем целое число
        System.out.print("Ваш выбор: ");
        int intValue = scanner.nextInt();

        // Закрываем сканер
        //scanner.close();

        return intValue;
    }
}
