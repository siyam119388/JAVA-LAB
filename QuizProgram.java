package Lab16_Problem2;

import java.io.*;
import java.util.*;

public class QuizProgram {

    public static void main(String[] args) {
        String filename = "quizzes.txt";
        List<Quiz> quizList = new ArrayList<>();

        // Step 1: Read Quiz records from the file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0].trim();
                int marks = Integer.parseInt(parts[1].trim());
                quizList.add(new Quiz(id, marks));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("Error reading the file: " + filename);
            e.printStackTrace();
            return;
        }

        // Convert list to array
        Quiz[] quizzes = quizList.toArray(new Quiz[0]);

        // Step 2: Print all Quiz objects
        for (Quiz quiz : quizzes) {
            System.out.println(quiz);
        }

        // Step 3: Find and print the ID of the student with the highest mark
        if (quizzes.length > 0) {
            Quiz highestMarkQuiz = quizzes[0];
            for (Quiz quiz : quizzes) {
                if (quiz.getMarks() > highestMarkQuiz.getMarks()) {
                    highestMarkQuiz = quiz;
                }
            }
            System.out.println("Student with the highest mark: " + highestMarkQuiz.getID());
        } else {
            System.out.println("No quiz records found.");
        }
    }
}
