import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;

//main method
public class Main {
    public static void main(String[] args) {
        // everything in the main will work from top all the way to down
        System.out.println("I love Pizza");// println so it can pass down the line
        System.out.println("It's really good");

        // or
        System.out.print("I love Pizza\n");

        // print double quote
        System.out.println("\"I love Pizza\"");
        // display back slash
        System.out.println("\\I love Pizza");

        //
        int age = 30, temperature = 20;
        age = 35;
        System.out.println(age);

        //
        int viewsCount = 123_456_789;// using _ for more readable
        long viewsCountt = 3_123_456_789L; // when too large, use long and L and the end
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        // Data has different type (refer to top)
        Date now = new Date();// new is a operator to allocate memory for this variable when dealing with
                              // reference type variable
        System.out.println(now);

        //
        byte x = 1;
        byte y = x;
        x = 2; // x and y are in different memory block, change x won't affect y

        //
        Point point1 = new Point(1, 1);
        Point point2 = point1;// reference type, they dont store actual value, they store a reference to an
                              // object somewhere in the memory, they are referencing to the same object
        point1.x = 2;// (x:1, y:1)
        System.out.println(point2);// x=2, y=1

        // reference type are copies by the references
        // primitive type are copies by their values (complete different than each
        // other)

        //
        String message = "Hello World" + "!!";

        System.out.println(message.endsWith("!!")); // true
        System.out.println("index of " + message.indexOf("H")); // 0
        System.out.println(message.replace("H", "O")); // don't modified original string, return a new string
        System.out.println(message); // the original string does not change, in java, string is immutable
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());// get rid of white spaces

        // saving (four escaping sequence)
        String save = "c:\\Windows\\..."; // need two backlashes
        // \n, java will start new line
        // \t , tab

        // array
        int[] numbers = new int[5]; // how many items we want to include in this array: 5
        numbers[0] = 1;
        numbers[1] = 2;
        Arrays.toString(numbers);// method overloading
        System.out.println("numbers" + Arrays.toString(numbers));

        // still array
        int[] numberss = { 2, 3, 5, 1, 4 };
        System.out.println(numberss.length);// 5
        Arrays.sort(numberss);

        //
        int[][] numbersss = new int[2][3];// have two rows and three columns
        numbersss[0][0] = 1; // first row and first column, initialize to 1
        System.out.println(Arrays.deepToString(numbersss));// [[1, 0, 0], [0, 0, 0]]

        int[][] numberssss = { { 1, 2, 3 }, { 4, 5, 6 } };// have two rows and three columns
        // [[1, 2, 3], [4, 5, 6]]

        //
        final float PI = 3.14F; // add F because java see this as decimal
                                // final means constant
                                // we usually use capital letter for constant

        //
        int result = 10 / 3;// whole #
        System.out.println(result);

        double resultt = (double) 10 / (double) 3;// casting into double
        System.out.println(result);

        int z = 1;
        z++;
        ++z;

        int o = z++; // z goint to be 2, o stay 1
        int oo = ++z; // z goint to be 2, o also 2

        z += 3;

        //
        short xx = 1; // two bytes
        int yy = xx + 2; // 3, four bytes

        // if really want to use int for double
        double xxx = 1.1;
        int yyy = (int) x + 2;// 3

        // Integer.parseInt(xxx);
        // Float.parseFloat(xxx);

        String nx = "1";
        int ny = Integer.parseInt(nx) + 2;

        String df = "1.1";
        double xc = Double.parseDouble(df) + 2;

        //
        int resultx = Math.round(1.1F);// 1
        int resultxz = (int) Math.ceil(1.1F);// 2, casting int because ceil return double, and we need integar
        int resultxzc = (int) Math.floor(1.1F); // 1, equal to smallest #
        int max = (int) Math.max(1, 2);// 2, return greater #
        double sdf = Math.round(Math.random() * 100);
        // int sdf = (int) Math.round(Math.random() * 100);
        // int sdf = (int) (Math.random() * 100);
        System.out.println(resultx);

        //
        NumberFormat currency = NumberFormat.getCurrencyInstance();// numberformat object store in currency
        String resultuio = currency.format(123456789.891);
        System.out.println(resultuio);// $1,234,567.89

        // NumberFormat percentage = NumberFormat.getPercentInstance();// numberformat
        // // bject store in currency
        // String resultp = percentage.format(0.1);
        // System.out.println(resultp);// 10%

        String resultp = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultp);// 10%

        //
        // Scanner scanner = new Scanner(System.in);// getting data from system
        // System.out.println("age: ");
        // byte agee = scanner.nextByte();
        // System.out.println("age" + agee);

        Scanner scanner = new Scanner(System.in);// getting data from system
        System.out.println("Name: ");
        String name = scanner.nextLine().trim(); // get the next line user enter
        System.out.println("Name" + name);

        // exercise: mortage calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scaner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

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