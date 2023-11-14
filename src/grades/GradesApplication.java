package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
                HashMap<String, Student> students = new HashMap<>();
                students.put("Harry", new Student("Harry"));
                students.get("Harry").addGrade(85);
                students.get("Harry").addGrade(90);
                students.get("Harry").addGrade(95);

                students.put("Harmione", new Student("Harmione"));
                students.get("Harmione").addGrade(80);
                students.get("Harmione").addGrade(85);
                students.get("Harmione").addGrade(90);

                students.put("Ron", new Student("Ron"));
                students.get("Ron").addGrade(90);
                students.get("Ron").addGrade(95);
                students.get("Ron").addGrade(100);

                students.put("Draco", new Student("Draco"));
                students.get("Draco").addGrade(85);
                students.get("Draco").addGrade(90);
                students.get("Draco").addGrade(95);

            Scanner scanner = new Scanner(System.in);
            String username;
            String continuePrompt;

            do {
                    System.out.println("Welcome!");
                    System.out.println("Here are the GitHub usernames of our students:");
                    for (String key : students.keySet()) {
                            System.out.println("|" + key + "|");
                    }

                    System.out.println("What student would you like to see more information on?");
                    username = scanner.nextLine();

                    if (students.containsKey(username)) {
                            Student student = students.get(username);
                            System.out.println("Name: " + student.getName() + " - GitHub Username: " + username);
                            System.out.println("Current Average: " + student.getGradeAverage());

                    } else {
                            System.out.println("Sorry, no student found with the GitHub username of \"" + username + "\".");
                    }

                    System.out.println("Would you like to see another student? (yes/no)");
                    continuePrompt = scanner.nextLine();
            } while (continuePrompt.equalsIgnoreCase("yes"));

            System.out.println("Goodbye, and have a wonderful day!");
            }
        }
