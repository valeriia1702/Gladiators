import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] monstersNames = {"dragon", "cyclop", "ogr", "gnom", "angry elf", "goblin", "minotaur", "zombie", "vampire", "harpia", "chimera"};
        System.out.println();
        System.out.println("Welcome to the Gladiators Game!");
        System.out.println();
        System.out.println("You can choose one of the gladiators:");
        System.out.println("1. Bestarius");
        System.out.println("2. Retiarius");
        System.out.println("3. Scutarius");
        System.out.print("Please choose your gladiator: ");
        int type = scanner.nextInt();
    }
}