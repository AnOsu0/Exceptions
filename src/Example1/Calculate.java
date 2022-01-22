package Example1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {

    private static Scanner sc = new Scanner(System.in);

    private static double add (double a, double b){
        return a+b;
    }
    private static double min (double a, double b){
        return a-b;
    }
    private static double mul (double a, double b){
        return a*b;
    }
    private static double div (double a, double b){
        return a/b;
    }

    private static String Print (String opt) {
        String result = switch (opt) {
            case "+" -> "Wynik dodawania to: ";
            case "-" -> "Wynik odejmowania to: ";
            case "*" -> "Wynik mnożenia to: ";
            case "/" -> "Wynik dzielenia to: ";
            default -> throw new UnknownOperatorException("Podano niewłaściwy operator");
        };
        return result;
    }

    public static String calculator (){
        double a = 0;
        double b = 0;
        String operator = "";
        boolean error = true;
        boolean error1 = true;
        String result = "";
        do {
            do {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = sc.nextDouble();
                sc.nextLine();
                System.out.println("Podaj drugą liczbę: ");
                b = sc.nextDouble();
                sc.nextLine();
                System.out.println("Podaj operator: ");
                operator = sc.nextLine();
                error1 = false;
            } catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Nie podałeś liczby, spróbujmy jeszcze raz");
            }

            } while (error1);
            try {
                switch (operator) {
                    case "+":
                        result = Print(operator) + add(a, b);
                        error = false;
                        break;
                    case "-":
                        result = Print(operator) + min(a, b);
                        error = false;
                        break;
                    case "*":
                        result = Print(operator) + mul(a, b);
                        error = false;
                        break;
                    case "/":
                        if (b != 0) {
                            result = Print(operator) + div(a, b);
                            error = false;
                        } else {
                            throw new ArithmeticException("Nie można dzielić przez 0");
                        }
                        break;
                    default:
                        throw new UnknownOperatorException("Podano zły operator");
                }
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            catch (UnknownOperatorException e){
                System.out.println( e.getMessage());
            }
        } while (error);

        return result;
    }

}
