package calc;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        while (true) {


            Scanner in = new Scanner(System.in);
//            System.out.println("Enter first number");
//            int a = in.nextInt();
//            System.out.println("Enter second number");
//            int b = in.nextInt();
//
//            System.out.println("Enter operation");
//            String s = in.next();
//            int print = Operators.Calculator(a,b,s);
//            System.out.println(print);


            String input = in.next();

            if (input.contains("+")) {
                String[] array = input.split("\\+");

                Operands operands = parseOperands(array);

                int answer = Operators.add(operands);
                System.out.println(answer);

            } else if (input.contains("-")) {
                String[] array = input.split("\\-");

                Operands operands = parseOperands(array);

                int answer = Operators.substraction(operands);
                System.out.println(answer);

            } else if (input.contains("*")) {
                String[] array = input.split("\\*");

                Operands operands = parseOperands(array);

                int answer = Operators.multification(operands);
                System.out.println(answer);

            } else if (input.contains("/")) {
                String[] array = input.split("\\/");

                Operands operands = parseOperands(array);

                double answer = Operators.devide(operands);
                System.out.println(answer);
            }
        }

    }

    public static Operands parseOperands(String[] input) {
        String a = input[0];
        String b = input[1];
        int a1 = Integer.parseInt(a.trim());
        int a2 = Integer.parseInt(b.trim());
        return new Operands(a1, a2);
    }

}


