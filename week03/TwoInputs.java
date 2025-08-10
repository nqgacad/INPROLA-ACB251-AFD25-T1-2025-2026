import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two integers:");

    // Numerical input
    int n1 = myObj.nextInt();
    int n2 = myObj.nextInt();

    // Output input by user
    System.out.println("First number: " + n1);
    System.out.println("Second number: " + n2);
    
    // Results for each operator:
    // addition:
    System.out.println("First number + Second number = " + (n1 + n2));

    // subtraction:
    System.out.println("First number - Second number = " + (n1 - n2));

    // division:
     System.out.println("First number / Second number = " + (n1 / n2));

    // multiplication:
     System.out.println("First number * Second number = " + (n1 * n2));
  }
}