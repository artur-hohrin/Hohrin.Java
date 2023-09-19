package task2;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите имя");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if(name.equalsIgnoreCase("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}
