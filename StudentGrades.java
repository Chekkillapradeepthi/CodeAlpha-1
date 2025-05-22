import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter student grades. Type -1 to finish:");

        while (true) {
            System.out.print("Enter grade: ");
            double input = scanner.nextDouble();

            if (input == -1) {
                break;
            } else if (input < 0 || input > 100) {
                System.out.println("Please enter a valid grade between 0 and 100.");
                continue;
            }

            grades.add(input);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
            return;
        }

        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum / grades.size();

        System.out.println("\nResults:");
        System.out.println("Number of grades entered: " + grades.size());
        System.out.printf("Average score: %.2f\n", average);
        System.out.printf("Highest score: %.2f\n", highest);
        System.out.printf("Lowest score: %.2f\n", lowest);

        scanner.close();
    }
}

