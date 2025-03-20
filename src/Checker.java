public class Checker {
    public static String getAnswer(String answer) {
        String theFinal ="";
        if (answer.contains("yes")||answer.equals("y")) {
            theFinal = "yes";
        } else if(answer.contains("no")||answer.equals("n")) {
            theFinal = "no";
        } else {
            theFinal = "Unable to find a clear answer";
        }
        return theFinal;
    }
    public static boolean getSpecificAnswer(String answer, String goal) {
        answer = answer.toLowerCase();
        goal = goal.toLowerCase();
        if (answer.equals(goal)) {
            return true;
        } else if (answer.contains(goal)) {
            return true;
        } else {
            return false;
        }
    }
}
