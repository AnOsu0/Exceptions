package Lesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int[] numbers = new int[2];
        boolean error = true;
        do {
            try {
                System.out.println("Podaj pierwszą liczbę");
                numbers[0] = sc.nextInt();
                System.out.println("Podaj drugą liczbę");
                numbers[1] = sc.nextInt();
                System.out.println("Którą liczbę chcesz wyświetlić (1 lub 2)?");
                System.out.println("liczba " + numbers[sc.nextInt() - 1]);
                error = false;
//            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e){
//                System.out.println("Niepoprawna wartość");
//                sc.nextLine();
//            }
            } catch (InputMismatchException e) {
                System.out.println("Nie podałeś liczby całkowitej spróbuj jeszcze raz");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Miało być 1 lub 2, zacznijmy od nowa");
            } finally {
                sc.nextLine();
            }
        } while (error);

        sc.close();
    }
}
