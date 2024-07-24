package problem_solving.sheet_1;

import java.util.Scanner;

public class say_hello {
    public static void main(String[] args) {
        String name;
        try (Scanner input = new Scanner(System.in)) {
            name = input.nextLine();
        }
        System.out.println("Hello, " + name);

    }
}
