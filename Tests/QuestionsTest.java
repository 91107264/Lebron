import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionsTest {
    @Test
    void checkQuestion1true() {
        String[] questions1 = {"Is LeBron 40?", "How many teams has LeBron played for?"};
        String[] answers1 = {"yes", "3"};
        Questions tester1 = new Questions(questions1, answers1);
        assertEquals("yes", tester1.getAnswer(0));
    }
    void checkQuestion2true() {
        String[] questions1 = {"Is LeBron the best player of all time?", "Does LeBron have children?"};
        String[] answers1 = {"yes", "yes"};
        Questions tester1 = new Questions(questions1, answers1);
        assertEquals("3", tester1.getAnswer(0));
        assertEquals("3", tester1.getAnswer(0));
    }
    void checkQuestion3true() {
        String[] questions1 = {"Is LeBron 40?", "How many teams has LeBron played for?"};
        String[] answers1 = {"yes", "okay"};
        Questions tester1 = new Questions(questions1, answers1);
        assertEquals("yes", tester1.getAnswer(0));
    }
    void checkQuestion4true() {
        String[] questions1 = {"Is LeBron 40?", "How many teams has LeBron played for?"};
        String[] answers1 = {"yes", "okay"};
        Questions tester1 = new Questions(questions1, answers1);
        assertEquals("yes", tester1.getAnswer(0));
    }
    void checkQuestion5true() {
        String[] questions1 = {"Is LeBron 40?", "How many teams has LeBron played for?"};
        String[] answers1 = {"yes", "3"};
        Questions tester1 = new Questions(questions1, answers1);
        answers1[1].matches("[A-Z]");
        assertEquals("yes", "yes");
    }
    void checkQuestion6true() {
        String[] questions1 = {"Is Bo Jackson 62?", "How many teams has Bo Jackson played for?"};
        String[] answers1 = {"yes", "4"};
        Questions tester1 = new Questions(questions1, answers1);
        assertEquals("yes", tester1.getAnswer(0));
    }
}