import java.util.Scanner;
import java.util.Random;

public class Questions {
    String[] questions;
    String[] answers;
    public Questions(String[] questions, String[] answers) {
        this.questions =questions;
        this.answers = answers;
    }

    public static boolean ChooseQuestion(int questnum, Questions quests) {
        Scanner scan = new Scanner(System.in);
        String[] questions = quests.getQuestions();
        String[] answers = quests.getAnswers();
        System.out.println(questions[questnum]);
        String goal = answers[questnum].toLowerCase();
        String answer = scan.nextLine().toLowerCase();

        boolean okay = answer.equals(goal);

        //System.out.println("Your answer: " + okay);
        PrintResponse(okay);
        if(!okay) System.out.println("The correct answer was: " + answers[questnum]);
        return okay;
    }
    public static boolean Question1() {
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        boolean okay = Checker.getSpecificAnswer(answer, "23");
        System.out.println("Your answer: " + okay);
        if (okay) {
            System.out.println("You got it right!");
            return true;
        } else {
            System.out.println("You got it wrong you are not a true sports fan!");
            System.out.println("The correct answer was: " + answer);
            return false;
        }
    }
    public String[] getQuestions() {
        return this.questions;
    }
    public String[] getAnswers() {

        return this.answers;
    }

    public static void PrintResponse(boolean answer) {
        Random rand = new Random();
        String correctanswers[] = {"Good one!","You got it right!","Wow, you might actually be a true sports fan!", "Correct answer!", "Good job!"};
        String wronganswers[] = {"Bad one!","Yeah, you're not a true sports fan.","Wow, horrible job!","How can you know this little about sports?", "You failed.","Oh you're not a contributing member of society."};
        if(answer) {
            System.out.println(correctanswers[rand.nextInt(5)]);
        } else {
            System.out.println(wronganswers[rand.nextInt(6)]);
        }
    }
    public String getQuestion(int index) {
        return questions[index];
    }
    public String getAnswer(int index) {
        return answers[index];
    }
}
