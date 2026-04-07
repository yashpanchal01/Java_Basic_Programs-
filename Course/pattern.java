package Course;
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char star = '*';
        System.out.print("Please Enter the Length: ");
        int length = scanner.nextInt();
        for(int i = 0; i < length; i++ ){
            int k = i;
            int len = length;
            int j = i;
            while(len+1-(k/2) > 0){
                // if((k/2)%2 == 0){
                //     System.out.print(" ");
                // }
                System.out.print(" ");
                len--;
            }
            while(j != 0){
                System.out.print(star);
                j--;
            }
            System.out.println();
        }
        
        for(int i = length; i > 0; i-- ){
            int j = i;
            int k = i;
            int len = length;
            while(len+1-(k/2) > 0){
                System.out.print(" ");
                len--;
            }
            while(j != 0){
                System.out.print(star);
                j--;
            }
            System.out.println();
        }
        scanner.close();
        }
    
    
    
}
