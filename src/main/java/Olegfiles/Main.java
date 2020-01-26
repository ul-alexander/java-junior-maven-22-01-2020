package Olegfiles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl fractionNumberA = new FractionNumberImpl();
        FractionNumberImpl fractionNumberB = new FractionNumberImpl();
        FractionNumberImpl fractionNumberC;
        FractionNumberOperationImpl fractionNumberOperation = new FractionNumberOperationImpl();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числитель 1-ой дроби: ");
        fractionNumberA.setDividend(scanner.nextInt());
        System.out.print("Введите знаменатель 1-ой дроби: ");
        fractionNumberA.setDivisor(scanner.nextInt());
        System.out.print("Введите числитель 2-ой дроби: ");
        fractionNumberB.setDividend(scanner.nextInt());
        System.out.print("Введите знаменатель 2-ой дроби: ");
        fractionNumberB.setDivisor(scanner.nextInt());
        System.out.println();
        System.out.print("Вы ввели дроби: ");
        fractionNumberA.printResult();
        System.out.print(" и ");
        fractionNumberB.printResult();
        System.out.println();

        fractionNumberOperation.setA(fractionNumberA);
        fractionNumberOperation.setB(fractionNumberB);

        System.out.println("Результат сложения дробей: ");
        fractionNumberC = fractionNumberOperation.add(fractionNumberA, fractionNumberB);
        fractionNumberC.printResult();
        System.out.println("=" +fractionNumberC.value());
        System.out.println();

        System.out.println("Результат вычитания дробей: ");
        fractionNumberC = fractionNumberOperation.sub(fractionNumberA, fractionNumberB);
        fractionNumberC.printResult();
        System.out.println("=" +fractionNumberC.value());
        System.out.println();

        System.out.println("Результат умножения дробей: ");
        fractionNumberC = fractionNumberOperation.mul(fractionNumberA, fractionNumberB);
        fractionNumberC.printResult();
        System.out.println("=" +fractionNumberC.value());
        System.out.println();

        System.out.println("Результат деления дробей: ");
        fractionNumberC = fractionNumberOperation.div(fractionNumberA, fractionNumberB);
        fractionNumberC.printResult();
        System.out.println("=" +fractionNumberC.value());

    }
}
