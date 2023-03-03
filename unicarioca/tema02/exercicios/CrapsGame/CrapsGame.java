import java.util.Random;
import java.util.Map;

class CrapsGame {

    private static final Random dice = new Random();

    private enum Status { CONTINUE, WON, LOST };

    private static Map<String, Integer> game_entries = new Map.ofEntries(
        Map.entry("SNAKE_EYES", 2),
        Map.entry("TREY", 3),
        Map.entry("SEVEN", 7),
        Map.entry("YO_LEVEN", 11),
        Map.entry("BOX_CARS", 13),
    );

    private static int rollDice() {
        int die1 = 1 + dice.nextInt(6);
        int die2 = 1 + dice.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    // init game
    public static void init () {
        // get the player's name
        System.out.print("Enter your name: ");
        String name = System.console().readLine();


    }

    public void main() {

    }
}