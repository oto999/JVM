import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chat options\n" +
                    "1: Does dog bark?\n" +
                    "2: Which is bigger, Sun or Moon?\n" +
                    "3: Custom\n" +
                    "0: Quit");

            var input = scanner.nextLine();
            input = InputManager.RedirectInput(input, scanner);
            if (input == null) break;
            System.out.println(input);
            var chatBot = new ChatBot(input);

            System.out.println(chatBot.Discuss());

        }
        System.out.println(ChatBot.SayGoodbye());
    }
}