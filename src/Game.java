import java.util.*;

public class Game {
    static String userName;


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        bootUp(userInput);
    }

    //runs once at the start of the game, opening sequence
    public static void bootUp(Scanner userInput) {
        System.out.println("Bzzz...bzzz...");
        wait(1500);
        System.out.println("Bzzz...bzzz...");
        wait(1500);
        System.out.print("Your eyes open to...");
        wait(1000);
        System.out.println("an office cubicle?!");
        wait(2000);
        System.out.println("A computer monitor sits on the desk front of you, fluorescent lights flickering overhead.");
        wait(2000);
        System.out.println("Stuck the right of your monitor is a sticky note reading: BOSS NEEDS PAPERWORK TOMORROW.");
        wait(2000);
        System.out.println("Hmm. Seems urgent.");
        wait(2000);
        System.out.println("You look down at a name tag on your shirt.");
        wait(1500);
        System.out.print("You are...");
        name(userInput);
        wait(1000);
        System.out.println("Well " + userName + ", " + "don't just sit there. That bulky, black rotary phone to your right is still ringing.");
        prePortal(userInput);
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void name(Scanner userInput) {
        userName = userInput.nextLine();
    }

    public static void prePortal(Scanner userInput) {
        String phoneResponse = userInput.nextLine();
        if (phoneResponse.contains("pick") && phoneResponse.contains("up") || phoneResponse.contains("answer")) {
            wait(1000);
            System.out.println("As you bring the receiver to your ear a croaking, old voice tumbles out.");
            wait(1500);
            System.out.println();
            System.out.println("\"It's dangerous to go alone!\"");
            System.out.println();
            wait(1500);
            System.out.println("With a buzz the line goes dead.");
            wait(1500);
        } else {
            System.out.println("The phone continues to ring.");
            System.out.println("You think that's strange.");
            System.out.println("Surely it's rung too many times already. Maybe you should just answer.");
            prePortal(userInput);
        }
        System.out.println("Well that was unusual, but it's time to clock out.");
        wait(2000);
        System.out.println("After the most boring subway ride of your life, you're back in your cramped apartment. Thrilling.");
        wait(2500);
        System.out.println("Why not relax for a bit? You sit down in front of your NES.");
        wait(3000);
        System.out.println("A cartridge you've never seen before is sitting on top. Maybe one of your friends dropped it off.");
        wait(3000);
        System.out.println("The sticker, peeling and scratched, reads BLIND MAN'S BLUFF.");
        wait(3000);
        System.out.println("Eh there's no better use of your time. You press start.");
        wait(2000);
        System.out.println("With a loud static noise, a hissing, crackling pop, your vision goes white. The couch below you disappears!");
        wait(2500);
        System.out.println("With a disoriented blink, it seems you're in a dungeon!");
        wait(2500);
        System.out.println("The air is damp and heavy. The smell alone makes you grimace.");
        wait(2500);
        System.out.println("Mossy stone walls on either side of you tower up above into darkness, just like the path ahead of you.");
        wait(2500);
        System.out.println("Boss sure isn't gonna get his paperwork on time.");
        title();
    }

    public static void title(){
        System.out.println();
        System.out.println();
        System.out.println("              />");
        System.out.println(" (           //------------------------------------------------------(");
        System.out.println("(*)OXOXOXOXO(*>                  --------                             \\");
        System.out.println(" (           \\--------------------------------------------------------)");
        System.out.println("              \\>");
        System.out.println();
        System.out.println(" ______ _ _           _  ___  ___            _      ______ _        __  __ _");
        System.out.println("| ___ \\ (_)         | | |  \\/  |           ( )     | ___ \\ |      / _|/ _| |");
        System.out.println("| |_/ / |_ _ __   __| | | .  . | __ _ _ __ |/ ___  | |_/ / |_   _| |_| |_| |");
        System.out.println("| ___ \\ | | '_ \\ / _` | | |\\/| |/ _` | '_ \\  / __| | ___ \\ | | | |  _|  _| |");
        System.out.println("| |_/ / | | | | | (_| | | |  | | (_| | | | | \\__ \\ | |_/ / | |_| | | | | |_|");
        System.out.println("\\____/|_|_|_| |_|\\__,_| \\_|  |_/\\__,_|_| |_| |___/ \\____/|_|\\__,_|_| |_| (_)");
        System.out.println();
        System.out.println();
        System.out.println("Danger awaits. Press enter to continue.");
        adventureAwaits();
    }
}
