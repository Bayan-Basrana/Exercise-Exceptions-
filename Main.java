import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
  1-Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
two numbers , takes two numbers as input
         */
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Please enter first number");
            int num1 = input.nextInt();
            System.out.println("Please enter 2nd number");
            int num2 = input.nextInt();
            System.out.println(num1 + num2);
            System.out.println(num1 - num2);
            System.out.println(num1 * num2);
            System.out.println(num1 / num2);
            System.out.println(num1 % num2);

        }catch (ArithmeticException a) {
            System.out.println(a.getMessage());

        }
/*
2. Write a Java program that takes a number as input and prints its multiplication table up to
10.
 */
        try {


            System.out.println("chose number to display its multiplication ");
            int number = input.nextInt();

            for (int x = 1; x <= 10; x++)
                System.out.println(number + "*" + x + "=" + number * x);
        }catch (InputMismatchException i){
            System.out.println("Invalid input");
            input.nextLine();
        }
/*
3. Write a Java program to print the area and perimeter of a circle.
 */
try {
    double area, perimeter, Radius;
    double x = 3.14;

    System.out.println("enter a Radius of the circle");
    Radius = input.nextDouble();
    System.out.println("Perimeter is = " + 2 * x * Radius);
    System.out.println("area is = " + x * (Radius * Radius));
}catch (InputMismatchException i){
    System.out.println("Invalid input for radius");
    input.nextLine();
}
 /*
  4. Java program to find out the average of a set of integers
  */
        try {
            int num;
            int sum = 0;
            System.out.println("Enter the count of numbers: ");
            int count = input.nextInt();

            for (int i = 1; i <= count; i++) {
                System.out.println(" Enter an integer: ");
                num = input.nextInt();
                sum = sum + num;
            }
            System.out.println("The average is: " + sum / count);
        }catch (ArithmeticException | InputMismatchException o){
            System.out.println(o.getMessage());

        }
        System.out.println();
/*
5. Write a Java program that accepts three integers as input, adds the first two integers
together, and then determines whether the sum is equal to the third integer.
 */
        try {
            System.out.println("Input the first number : ");
            int number1 = input.nextInt();
            System.out.println("Input the 2nd number : ");
            int number2 = input.nextInt();
            System.out.println("Input the third number : ");
            int number3 = input.nextInt();
            int sumOf_2number = (number1 + number2);
            if (sumOf_2number == number3) {
                System.out.println("The result is: true");
            } else {
                System.out.println("The result is: false");
            }
        }catch (InputMismatchException i){
            System.out.println("Invalid input");
            input.nextLine();
        }
/*
6. Write a Java program to reverse a word.
 */
       try {
           System.out.print(" Enter a word to reverse");
           String word = input.next();
if(word ==null || word.isEmpty()){
    throw new IllegalArgumentException(" the word can't be null or empty");
}
           String reverse = "";
           for (int i = word.length() - 1; i >= 0; i--) {
               reverse = reverse + word.charAt(i);
           }
           System.out.println(reverse);
       }catch (IllegalArgumentException i){
           System.out.println(i.getMessage());
       }
/*
7 -  Java program to check whether the given number is even or odd
 */
        try{
        System.out.println("Enter a number to check it even or odd");
        int numb= input.nextInt();
        if (numb%2==0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }catch (InputMismatchException i){
        System.out.println("Invalid input");
        input.nextLine();
    }

  /*
  8 - Java program to convert the temperature in Centigrade to Fahrenheit
   */
        try{
        System.out.println(" Enter the temperature in Centigrade to covert");
        double  Centigrade =input.nextDouble();
        double Fahrenheit = Centigrade * 1.8 + 32;
        System.out.println(Fahrenheit);
        }catch (InputMismatchException i){
            System.out.println("Invalid input");
            input.nextLine();
        }
 /*
 9.Write a Java program that takes a string and a number from the user,then prints the
character in the given index.
  */
        try{
        System.out.println("Enter a String");
        String text = input.next();
        System.out.println("Chose number");
        int numberr = input.nextInt();
        System.out.println(text.charAt(numberr));
    }catch (IllegalArgumentException i){
        System.out.println("Invalid input");
    }catch (StringIndexOutOfBoundsException s){
            System.out.println("Index out of bound");
        }
        input.nextLine();
/*
10. Write a Java program to print the area and perimeter of a rectangle.
 */
        try{
        double area_rectangle , perimeter_rectangle , width,height;
        System.out.println("enter a Width of the rectangle");
        width =input.nextDouble();
        System.out.println("enter a Height of the rectangle");
        height =input.nextDouble();

        System.out.println("Perimeter is = " + (2*(height+width)));
        System.out.println("area is = " +(width*height) );
    }catch (InputMismatchException i){
        System.out.println("Invalid input");
        input.nextLine();
    }
/*
11. Write a Java program to compare two numbers.
 */
        try{
        System.out.println("Enter first number ");
        int fir_number = input.nextInt();
        System.out.println("Enter 2nd number ");
        int secnd_number = input.nextInt();
        if (fir_number != secnd_number )
            System.out.println( fir_number+ "!= "+ secnd_number);
        if (fir_number<secnd_number)
            System.out.println( fir_number+ "< "+ secnd_number);
        if (fir_number<=secnd_number)
            System.out.println( fir_number+ "<= "+ secnd_number);
    }catch (InputMismatchException i){
        System.out.println("Invalid input");
        input.nextLine();
    }
  /*
  12. Write a Java program to convert seconds to hours, minutes and seconds.
   */
        try{
        System.out.println("Enter the seconds to convert ");
        int input_seconds= input.nextInt();

        if (input_seconds<0){
            throw new IllegalArgumentException("second cannot be negative");
        }
        int hours =input_seconds/3600;
        int minutes =( input_seconds%3600)/60;
        int seconds =input_seconds%60;
        System.out.println(hours+":"+minutes+":"+ seconds);
        }catch (InputMismatchException i){
            System.out.println("Invalid input");
            input.nextLine();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
/*
13. Write a Java program that accepts four integers from the user and prints equal if all
four are equal, and not equal otherwise
 */
        try{
        System.out.print("Input first number: ");
        int first_num = input.nextInt();
        System.out.print("Input second number: ");
        int second_num = input.nextInt();
        System.out.print("Input third number: ");
        int third_num = input.nextInt();
        System.out.print("Input fourth number: ");
        int fourth_num = input.nextInt();

        if(first_num ==second_num && first_num==third_num && first_num==fourth_num )
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are not equal");
        }catch (InputMismatchException i){
            System.out.println("Invalid input");
            input.nextLine();
        }
/*
14. Write a Java program that reads an integer and check whether it is negative, zero, or
positive.
 */
        try{
        System.out.println(" Enter an integer");
        int integer = input.nextInt();
        if(integer>0)
            System.out.println("Number is positive  ");
        else if (integer<0)
            System.out.println("Number is negative  ");
        else
            System.out.println("Number is Zero  ");

        }catch (InputMismatchException i){
            System.out.println("Invalid input");
            input.nextLine();
        }
/*
15.Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered  (End loop use -1 ,
Don’t count -1).
 */
        try{
        int numbers ;
        int count_pos=0;
        int count_negative=0;
        int count_Zero=0;

        do {
            System.out.println("Enter number or -1 to End  ");
            numbers = input.nextInt();
            if (numbers==-1)
                break;
            else if (numbers>0)
                count_pos++;
            else if (numbers<0)
                count_negative++;
            else
                count_Zero++;

        }while(numbers!=-1);
        System.out.println(count_negative );
        System.out.println(count_pos );
        System.out.println(count_Zero );
        }catch (InputMismatchException i){
            System.out.println("Invalid input");
        }catch (Exception e){
            System.out.println(e.getMessage());
            input.nextLine();
        }
/*
16 - Write a program that prompts the user to input an integer and then outputs the
number with the digits reversed.
 */
        try{
        System.out.println("input an integer");
        int num_int= input.nextInt();
        int reversed =0;
        while (num_int!=0) {
            int digit = num_int % 10;
            reversed = reversed * 10 + digit;
            num_int /=10;
        }
        System.out.println(reversed);
        }catch (InputMismatchException i){
            System.out.println("Invalid input");
            input.nextLine();
        }

   /*
   17 - Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered.
    */
try {
    int number_17;
    int smallest;
    int largest;

    System.out.println("Enter a number (or Zero to End): ");
    number_17 = input.nextInt();

    if (number_17 == 0) {
        throw new NoSuchElementException("no valid numbers were entered");
    }
    smallest = number_17;
    largest = number_17;
    do {
        System.out.println("Enter another number (or Zero to End): ");
        number_17 = input.nextInt();

        if (number_17 == 0) {
            break;
        }
        if (number_17 > largest) {
            largest = number_17;
        }
        if (number_17 < smallest) {
            smallest = number_17;
        }

    } while (number_17 != 0);
    System.out.println("Largest: " + largest);
    System.out.println("Smallest: " + smallest);
}catch (InputMismatchException i){
    System.out.println("Invalid input");
}catch (NoSuchElementException n){
    System.out.println(n.getMessage());

        input.nextLine();
}
        /*
        18 - Determine and print the number of times the character ‘a’ appears in the input
entered by the user.
         */
        try {
            System.out.println("enter String");
            String textt = input.nextLine();

            if(textt== null || textt.isEmpty()){
                throw new NullPointerException(" cannot be null or empty");
            }
            int coun_string = 0;
            for (int i = 0; i < textt.length(); i++)
                if (textt.charAt(i) == 'a')
                    coun_string++;
            System.out.println("Number of a's:  " + coun_string);

        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }catch (Exception s){
            System.out.println(s.getMessage());
        }


    }
}