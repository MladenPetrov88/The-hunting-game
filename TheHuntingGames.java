import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());

        double totalWater = days * players * waterPerDay;
        double totalFood = days * players * foodPerDay;




        for (int i = 1; i <= days; i++) {
            double lossEnergy = Double.parseDouble(scanner.nextLine());
            energy -= lossEnergy;

            if (energy <= 0) {
                break;
            }

            if (i % 2 == 0) {
                energy = energy + (energy * 0.05);
                totalWater = totalWater - (totalWater * 0.30);
            }

            if (i % 3 == 0) {
                energy = energy + (energy * 0.10);
                totalFood = totalFood - (totalFood / players);
            }


        }
            if (energy > 0) {
                System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
            } else {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
            }
    }
}
