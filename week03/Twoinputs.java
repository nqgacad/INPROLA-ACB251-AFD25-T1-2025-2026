import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two integers:");

    // Numerical input
    int firstNumber = myObj.nextInt();
    int secondNumber = myObj.nextInt();

    // Output input by user
    System.out.println("First number: " + firstNumber);
    System.out.println("Second number: " + secondNumber);
    
  }
}