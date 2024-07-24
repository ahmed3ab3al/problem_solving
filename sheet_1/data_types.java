package problem_solving.sheet_1;

import java.util.Scanner;

public class data_types {
    public static void main(String[] args) {
        int num;
        long num2;
        String ch;
        float num3;
        double num4;
        try (Scanner input = new Scanner(System.in)) {
            num=input.nextInt();
            num2=input.nextLong();
            ch=input.next();
            num3=input.nextFloat();
            num4=input.nextDouble();
        }
        System.out.println(num);
        System.out.println(num2);
        System.out.println(ch);
        System.out.println(num3);
        System.out.println(num4);


    }
}
