// Grade Calculator Practice, 11-16-2021, v0.1

import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("This program will take a numerical grade between 0 and 100 and then print the letter grade.");
        double grade;
        System.out.println("Input a grade with the decimal value, for example if the grade is a 90, put 90.0.");
        grade = myScanner.nextDouble();
        
        if (grade >= 89.5) {
            System.out.println("That grade is an A.\n");
        } else if (grade >= 79.5) {
            System.out.println("That grade is a B.\n");
        } else if (grade >= 69.5) {
            System.out.println("That grade is a C.\n");
        } else if (grade >= 59.5) {
            System.out.println("That grade is a D.\n");
        } else {
            System.out.println("That grade is an F.\n");
        }
    }

}
