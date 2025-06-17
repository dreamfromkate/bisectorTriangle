package org.example;

import org.example.enums.Constants;
import org.example.enums.Position;
import org.fusesource.jansi.AnsiConsole;

import java.util.Scanner;

public class Menu{

    public void getTitle(){
        clearConsole();


        printLine("*");
        print(Constants.TITLE, Position.CENTRE);
        printLine("*");
    }

    public int getSetSide(String output){

        Scanner scanner = new Scanner(System.in);

        System.out.print(output);
        int intValue = scanner.nextInt();

        return intValue;
    }

    public boolean getChoice(){
        printLine("_");
        print(Constants.MENU, Position.LEFT);

        Scanner scanner = new Scanner(System.in);

        int intValue = scanner.nextInt();

        if (intValue == 2) {
            return true;
        }

        return false;
    }

    private void clearConsole() {
        try {
            // Определение операционной системы
            String operatingSystem = System.getProperty("os.name").toLowerCase();

            if (operatingSystem.contains("win")) {
                // Для Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Для UNIX-подобных систем (Linux, macOS)
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getWidth(){

        // Настройка AnsiConsole
        AnsiConsole.systemInstall();

        // Возврат значения ширины терминала
        return AnsiConsole.getTerminalWidth();
    }

    private void print(String output, Position position) {
        if (position.toString() == "LEFT") {
            left(output);
        }
        if (position.toString() == "CENTRE") {
            center(output, getWidth());
        }
    }

    private void left(String output){
        System.out.println(output);
    }

    private void center(String output, int width){
        System.out.println(String.format("%" + (width/2+ output.length()) + "s", output));
    }

    private void printLine(String sign){
        System.out.println(sign.repeat(getWidth()));
    }

}
