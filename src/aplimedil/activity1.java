package aplimedil;

import java.util.Scanner;

public class activity1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        String name;
        int scienceMarks, historyMarks, mathMarks, socMarks, artsMarks;
        
        
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter marks in Science: ");
        scienceMarks = scanner.nextInt();
        
        System.out.print("Enter marks in History: ");
        historyMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Math: ");
        mathMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Soc: ");
        socMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Arts: ");
        artsMarks = scanner.nextInt();
        
       
        int totalMarks = scienceMarks + historyMarks + mathMarks + socMarks + artsMarks;
        double totalPercentage = (totalMarks / 5.0);
        
        
        String remarks;
        String message;
        
        if (totalPercentage < 70) {
            remarks = "Fail";
            message = "Try Again";
        } else if (totalPercentage >= 70 && totalPercentage <= 75) {
            remarks = "Poor";
            message = "Keep Trying";
        } else if (totalPercentage > 75 && totalPercentage <= 80) {
            remarks = "Fair";
            message = "Nice Work";
        } else if (totalPercentage > 80 && totalPercentage <= 85) {
            remarks = "Good";
            message = "Well Done";
        } else if (totalPercentage > 85 && totalPercentage <= 90) {
            remarks = "Very Good";
            message = "Almost Excellent";
        } else {
            remarks = "Excellent";
            message = "Congrats! You Passed.";
        }
        
     
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total Percentage: %.2f\n", totalPercentage);
        System.out.println("Remarks: " + remarks);
        System.out.println(message);
        
        
        scanner.close();
    }
}
