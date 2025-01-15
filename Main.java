package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalIncome;
        int staffExpense, otherExpense;

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");

        totalIncome = 202 + 118 + 2250 + 1680 + 1075 + 80;

        System.out.println("Income: $" + totalIncome);

        System.out.println("Staff expenses: ");
        staffExpense = scnr.nextInt();

        System.out.println("Other expenses: ");
        otherExpense = scnr.nextInt();

        totalIncome -= otherExpense + staffExpense;

        System.out.printf("Net income: $%d\n", totalIncome);

        scnr.close();
    }
}
