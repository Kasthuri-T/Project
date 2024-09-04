import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter student grades. Type -1 to finish.");

        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }

        if (grades.size() > 0) {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }

            double average = sum / grades.size();
            double highest = Collections.max(grades);
            double lowest = Collections.min(grades);

            System.out.println("\n--- Grade Summary ---");
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        } else {
            System.out.println("No grades were entered.");
        }

        scanner.close();
    }
}