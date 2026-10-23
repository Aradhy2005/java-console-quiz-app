import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] answers = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Which language was Java originally inspired by / based on?", "C", "C++", "Python", "C#", "C++");
        questions[1] = new Question(2, "Which component is responsible for executing bytecode in Java?", "JVM", "JRE", "JDK", "Compiler", "JVM");
        questions[2] = new Question(3, "Which of these concepts means wrapping data and methods into a single unit?", "Inheritance", "Polymorphism", "Encapsulation", "Abstraction", "Encapsulation");
        questions[3] = new Question(4, "Which keyword is used to access the parent class constructor?", "this", "super", "extends", "base", "super");
        questions[4] = new Question(5, "Which package contains the Random class in Java?", "java.util", "java.lang", "java.io", "java.net", "java.util");
    }

    public void playQuiz() {
        int i=0;
        for(Question q : questions) {
            System.out.println("Question no : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. "+q.getOpt1());
            System.out.println("2. "+q.getOpt2());
            System.out.println("3. "+q.getOpt3());
            System.out.println("4. "+q.getOpt4());

            Scanner sc = new Scanner(System.in);
            answers[i++] = sc.nextLine(); 
            
        }

        for(String s : answers) {
            System.out.println(s);
        }

    }

    public void printScore() {
        int score = 0;
        for(int i=0;i<questions.length;i++) {

            Question q = questions[i];
            String ans = q.getAnswer();

            if(ans.equals(answers[i])) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }

}
