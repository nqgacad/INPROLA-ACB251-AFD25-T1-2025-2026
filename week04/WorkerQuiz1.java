import java.util.Scanner;

public class WorkerQuiz1 {
    public static void main(String[] args) {
    
    public int start;
    public int end;

    public WorkerQuiz1(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void processRange() {
        int current = start;
        while (current <= end) {
            if (current % 2 != 0) { // Odd check
                if (isPrime(current)) {
                    System.out.println(current + " is odd and a prime number.");
                }
            }
            current++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;

    //scanner    
    Scanner scannerNumber = new Scanner(System.in);
    
    //odd number checker
    System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

    WorkerQuiz1 worker = new WorkerQuiz1(start, end);
    worker.processRange();

    }
}