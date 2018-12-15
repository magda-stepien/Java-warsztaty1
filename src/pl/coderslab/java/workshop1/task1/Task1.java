package pl.coderslab.java.workshop1.task1;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; //bo jest do 100 exclusive czyli do 99 i trzeba dodać 1
        int number = -1;
        int attempts = 0;

        if (args.length > 0 && args[0].equals("iddqd")) { // DOOM GOD MODE - jeśli wpiszemy w argumentach to pokaże wylosowaną liczbę
            // wpisujemy przez Task1 - strzałka na dół -> Edit configurations i dodajemy nazwę w Program arguments
            // czy args od zera istnieje
            System.out.print(String.format("*** wylosowana liczba: %d", randomNumber));
        }

        do {
            number = getNumber("Podaj liczbę: ");
            if (number > randomNumber) {
                System.out.print("Za dużo!");
            } else if (number < randomNumber){
                System.out.print("Za mało!");
            }
            attempts ++;
        } while (randomNumber != number); {
//            System.out.println("Zgadłeś!");
            System.out.println(String.format("Zgadłeś w %d próbach", attempts);
        }
    }

    //Sczytywanie liczb od użytkownika - metoda bo wywoływane wielokrotnie
    static int getNumber (String prompt) {
        System.out.print(prompt); // będziemy tak długo pytać o wejście aż dostaniemy coś co będzie intem
        // daltego bez obsługi wyjątku
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("To nie jest liczba! ");
            System.out.print(prompt);
        }

        return scanner.nextInt();

    }
}
