import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        System.out.println("type your birthdate in the format yyyy mm dd");
        LocalDate birthDay = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        int years = Period.between(birthDay, today).getYears();
        System.out.println(years);
    }
} 