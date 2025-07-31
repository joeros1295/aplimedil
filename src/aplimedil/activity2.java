
package aplimedil;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a number: ");
        int number = scanner.nextInt(); 

        
        if (number == 0) {
            System.out.println("Inputted number Zero");
        } 
        
        else if (number % 2 == 0) {
            System.out.println("Inputted number is even");
        } 
        
        else {
            System.out.println("Inputted number is odd");
        }

        scanner.close(); 
    }
}
