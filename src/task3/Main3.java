package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Введите числа через пробел");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (String string : s.split(" ")) {
            arrayList.add(Integer.valueOf(string));
        }

        arrayList.stream().filter(i -> i%3 == 0).forEach(System.out::println);

    }
}
