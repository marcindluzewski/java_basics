import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String surname = scanner.nextLine();
        System.out.println("Ile masz lat?");
        String age_s = scanner.nextLine();
        int age = Integer.parseInt(age_s);
        System.out.println("Witaj " + name + " " + surname + " " + "masz " + age + " lat");

            if (age > 18){
                System.out.println("You are an adult - access granted!");
            } else {
                System.out.println("You are underage - access denied!");
            }
        }
    }