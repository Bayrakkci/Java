import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("Result" + z);
        }
        catch (ArithmeticException fuck){
            System.out.println("You just caused arithmetic exception");
        }
        catch(InputMismatchException fuck){
            System.out.println("Please enter a number! You just caused Mismatch exception");
        }
        catch(Exception fuck){
            System.out.println("Something wrong!");
        }
        finally {
            System.out.println("Thanks for using this program");
            scanner.close();
        }
    }
}