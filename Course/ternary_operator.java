package Course;
import java.util.Scanner;


public class ternary_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        int income = 30000;

        String passOrFail = (score > 60) ? "Passed" : "Failed!";
        double taxRate = (income >= 40000 ) ? 0.32 : 0.23; 
        
        System.out.println(passOrFail);
        System.out.println(taxRate);

        scanner.close();
    }
    
}
