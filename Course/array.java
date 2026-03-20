package Course;
import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        char[][] numPad = { {'3','2', '1'},
                            {'4','5', '6'},
                            {'7','8', '9'},
                            {'*','0', '#'}
                            };

        // Arrays.sort(numPad);
        // System.out.println(numPad);

        for(char[] nums: numPad){
            Arrays.sort(nums);
            for(char num: nums){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // numPad[1][0] = '9';
        // System.out.println(numPad[1][0]);
    }
}

// arrays are reference data types --> meaning it will point to a memory address 