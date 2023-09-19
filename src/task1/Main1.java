package task1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Введите число");

        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();

        if(s > 7){
            System.out.println("Привет");
        }
    }
}
