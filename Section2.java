import java.util.Scanner;

public class Section2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        System.out.println(x == y); // true

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        // also have ||
        // boolean isEligiblw = (hasHighIncome || hasGoodCredit) && !isACriminal;

        int temp = 32;
        if (temp > 30) {
            System.out.println("hot");
        } else if (temp > 20) {
            System.out.println("Beautiful day");
        }

        //
        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000) {
            hasHighIncome = true; // if declare the boolean inside this block, will only gets call here
        } else {
            hasHighIncome = false;
        }

        System.out.println(hasHighIncome);

        // better way
        int incomee = 120_000;
        boolean hasHighIncomee = (income > 100_000);

        // ternary operator
        int incomeeee = 120_000;
        String className = "Economy";
        if (incomeeee > 100_000)
            className = "First";

        // in ternary
        String classNameee = income > 100_000 ? "First" : "Second";

        // switch statement
        String role = "admin"; // can use int too
        switch (role) {
            case "admin":
                System.out.println("...");
                break;
            case "moderator":
                System.out.println("...");
                break;
            default:
                System.out.println("...");
        }

        // fizzbuzz
        Scanner scannerrr = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextint();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        // optimize (not really)
        Scanner scannerrr = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scannerrr.nextint();

        if (number % 5 == 0) {
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        } else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World" + i); // printed 5 times
        }

        int h = 0;
        while (h > 0) {
            System.out.println();
            h--;
        }

        // while loop usage
        Scanner scannerrrr = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scannerrrr.next().toLowerCase();
            System.out.println(input);

            if (something)
                continue;
            if (something)
                break; // means return here
        }
        // != is not working here because input is a string which is a reference type
        // cannot use comparison operators bw reference types, because it will compare
        // the address or a string object
        // not their value

        // more professional way; while true
        // using while true; make sure have break statement to stop
        while (true) {
            System.out.println("Input: ");
            input = scannerrrr.next().toLowerCase();
            System.out.println(input);

            if (something)
                continue;
            if (something)
                break; // means return here
        }

        // do while loop, will always get executed at least once
        // no prefer
        do {
            System.out.println("Input: ");
            input = scannerrrr.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        // for each loop
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (int i = fruits.length; i > 0; i--) {
            System.out.println(fruits[i]);
        } // reverse

        for (String fruit : fruits) {
            System.out.println(fruit);// same result but cannot do reverse, not ideal
        }

        // error handling
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int princiapl = 0;

        Scanner scaner = new Scanner(System.in);

        while (true) {// error handle
            System.out.print("Principal: ");
            princiapl = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break; // beaak out this infinite loop
            } else {
                System.out.println("Enter valid #");
            }
        }

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();// formatted as a currency
        System.out.println("Mortgaga: " + mortgageFormatted);
    }
}
