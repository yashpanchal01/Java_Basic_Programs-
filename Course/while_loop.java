package Course;
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        String name = "";
        
        while(name.length() <= 0 ){
            System.out.print("Enter a your name: ");
            name = scanner.nextLine();
        }
        // System.out.println("Hellow " + name);

        scanner.close();
            
    }
    
}
