import java.util.Scanner;

public class grade_calculator {
    public static void main(String args[]) {

        // take input of no of subjects marks from user
        Scanner marks = new Scanner(System.in);
        System.out.println("****STUDENT GRADE CALCULATOR**** \n");
        System.out.println("Enter number of subjects: ");
        int n = marks.nextInt();
        System.out.println("Enter marks of " + n + " subjects: ");

        // calculate marks of given number of subjects
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = marks.nextInt();
            sum += x;
        }
        marks.close();

        System.out.println("***RESULT***");
        System.out.println("Total marks: " + sum + "/" + (n * 100));
        // calculate percentage
        float percentage = (float) sum / n;
        System.out.println("Percentage: " + percentage + "%");

        // calculate grade
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");

        } else {
            System.out.println("Grade: F");
        }

    }
}
