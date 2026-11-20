import java.util.Scanner;

public class task9_ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 0) {
                throw new Exception("Age cannot be negative");
            }
            System.out.println("Age: " + age);
            if (age < 18) {
                System.out.println("Category: Child");
            } else {
                System.out.println("Category: Adult");
            }
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Program ended");
            scanner.close();
        }
    }
}