package org.example;

import org.fusesource.jansi.AnsiConsole;

public class Print {

    public static void getTitle(){
        clearConsole();

        Print.printTitle("Вычисление длины биссектрисы треугольника", "Центр");
        Print.printLine();
    }

    public static void printLine(){
        System.out.println(String.valueOf("_").repeat(getWidth()));
    }

    public static void side (Triangle triangle){
        System.out.println("Длина первой стороны: " + triangle.getFirstSide());
        System.out.println("Длина второй стороны: " + triangle.getSecondSide());
        System.out.println("Длина третьей стороны: " + triangle.getThirdSide());
    }

    public static void menu (Menu menu){
        System.out.println(menu.getRepeat());
        System.out.println(menu.getEndProg());
    }

    private static void left(String output){
        System.out.println(output);
    }

    private static void center(String output, int width){
        System.out.println(String.format("%" + (width/2 + output.length()) + "s", output));

    }

    private static int getWidth(){

        // Настройка AnsiConsole
        AnsiConsole.systemInstall();

        // Возврат значения ширины терминала
        return AnsiConsole.getTerminalWidth();
    }

    private static void printTitle(String output, String alignment) {
        if (alignment.equals("Лево")) left(output);
        if (alignment.equals("Центр")) center(output, getWidth());

    }

    private static void clearConsole() {
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
}
