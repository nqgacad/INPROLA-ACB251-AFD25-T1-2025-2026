import java.util.Scanner;

class LoopExercise {
  public static void main(String[] args) {
    Scanner newScanner = new Scanner(System.in);
  
    // accepting input from user
    System.out.print("Enter your starting number: ");
    int start = newScanner.nextInt();
    System.out.print("Enter your ending number: ");
    int end = newScanner.nextInt();

    // for loop  
    System.out.println("Starting Number is: " + start);  // Output user input
    System.out.println("Ending Number is: " + end);  // Output user input
    System.out.println("Even numbers between " + start + " and " + end + ":");
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        System.out.println(i);

    }
  }
}