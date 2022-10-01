import java.util.Scanner;

public class InputManager {
    private static boolean IsNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String RedirectInput(String input, Scanner scanner){
        if (!IsNumeric(input)) return input;
        switch (Integer.parseInt(input)){
            case 0:
                return null;
            case 1:
                return "Does dog bark?";
            case 2:
                return "Which is bigger, Sun or Moon?";
            default:
                return input;
        }
    }

}
