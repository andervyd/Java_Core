package by.andervyd.temp.return_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReturnCatchBlock {
    public static void main(String[] args) {

        while (true) {
            try  {
                Scanner scanner = new Scanner(System.in);

                System.out.print("A = ");
                int firstNumber = scanner.nextInt();

                System.out.print("B = ");
                int secondNumber = scanner.nextInt();

                scanner.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
    }
}