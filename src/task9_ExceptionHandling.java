import java.util.InputMismatchException;
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
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid numeric age.");
        }catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Program ended");
            scanner.close();
        }
    }
}