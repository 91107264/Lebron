import java.util.Scanner;

public class Game {
    public static void StartGame() {
        int[] questions = {0, 1, 2, 3, 4, 5, 6, 7};
        String[] questions1 = {"What number does LeBron wear?", "How old is LeBron?", "Does LeBron have a son on the same NBA team as him?","What is the name of LeBron's son who plays on the Lakers?","How many team has LeBron played for?","What team is LeBron currently playing for?","Is LeBron the greatest player of all time?","Who has scored the most points in NBA history?"};
        String[] answers1 = {"23", "40", "yes","Bronny","3","The Lakers","yes","LeBron James"};
        String[] questions2 = {"How fast was Bo Jacksons 40 yard dash?", "How old is Bo Jackson?", "How many seasons of football did BoJackson play?","Did BoJackson get married?","How many teams has BoJackson played for professionally?","What team did BoJackson last play for?","Was BoJackson a great player?","Did BoJackson win any superbowls?"};
        String[] answers2 = {"4.12 seconds", "62", "4","yes","4","The Angels","yes","no"};

        Questions LeBronQuestions = new Questions(questions1, answers1);
        Questions BoJacksonQuestions = new Questions(questions2, answers2);
        int score = 0;
        boolean correct;
        System.out.println("Welcome to sports trivia lets see if you are a true Sprots fan!");
        // size of array
        int n = questions.length;
        System.out.println("Time for LeBron trivia!");
        Utility.shuffleArray(questions);
        for (int question : questions) {
            correct = Questions.ChooseQuestion(question, LeBronQuestions);
            if (correct) {
                score++;
            }
        }
        System.out.println("Alright your score for LeBron Trivia is " + score + "/8." );
        System.out.println("Time for Bo Jackson trivia!");
        for (int question : questions) {
            correct = Questions.ChooseQuestion(question, BoJacksonQuestions);
            if (correct) {
                score++;
            }
        }
        System.out.println("Alright your overall score for sports trivia is " + score + "/16." );
        if(score >= 10) {
            System.out.println("Good job!");
        }
        else {
            System.out.println("Try again for a better score!");
        }
    }
}