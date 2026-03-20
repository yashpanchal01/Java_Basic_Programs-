package Course;
import java.util.Scanner;

public class ifAndNestedIf {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();

        if(age > 18 ){

            System.out.println("you are an adult!");
            if(gender.equals("male")){
                System.out.println("Male too");
            }
            else{
                System.out.println("hehe");
            }
        }
        else{
            System.out.println("You are just a child!");
        }
        scanner.close();
    }
}
