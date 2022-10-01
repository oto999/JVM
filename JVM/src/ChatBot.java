public class ChatBot implements ChatBase
{
    private String userInput;

    public ChatBot(String userInput){
        this.userInput = userInput;
    }

    public void InputString(String userInput){
        this.userInput = userInput;
    }

    public String Discuss(){
        switch (String.valueOf(userInput)){
            case "Does dog bark?":
                return "Yes";
            case "Which is bigger, Sun or Moon?":
                return "Me";
            default:
                return "That made no sense to me";
        }
    }

    public static String SayGoodbye() {
        return "Bye";
    }
}
