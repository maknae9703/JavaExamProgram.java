public class JavaExamProgram {

    // Method to display coursework results
    private static void viewCourseworkResults() {
        System.out.println("Displaying coursework results.");
        int[] coursework = { 10, 10, 10, 10, 10 };
        // Example coursework results (ass1, ass2, ass3, cat1, cat2)
        int totalCoursework = 0;
        for (int mark : coursework) {
            totalCoursework += mark;
        }
        double courseworkPercentage = totalCoursework / 50.0 * 100;
        System.out.println("Coursework total: " + totalCoursework + "/50 (" + courseworkPercentage + "%)");
    }

    // Method to display exam results
    private static void viewExamResults() {
        System.out.println("Displaying exam results.");
        int finalExam = 40;
        // Example final exam score
        System.out.println("Final exam score: " + finalExam + "/50");
    }

    // Method to count coursework assessments done
    private static int countCourseworkAssessments() {
        int[] coursework = { 10, 10, 10, 10, 10 };
        // Example coursework assessments (ass1, ass2, ass3, cat1, cat2)
        int count = 0;
        for (int mark : coursework) {
            if (mark > 0) {
                count++;
            }
        }
        return count;
    }

    // Method to determine if a student has done 2/3 of the coursework
    private static boolean isTwoThirdsCourseworkDone(int count) {
        return count >= (5 * 2 / 3.0);
    }

    public static void main(String[] args) {
        int choice;
        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");
            System.out.print("Enter your choice: ");

            // Get user choice = getUserChoice( );

            // Handle user choice
            switch (choice) {
                case 1:
                    viewCourseworkResults();
                    int courseworkCount = countCourseworkAssessments();
                    boolean isTwoThirdsDone = isTwoThirdsCourseworkDone(courseworkCount);
                    if (!isTwoThirdsDone) {
                        System.out.println("Student has not completed 2/3 of the coursework and must repeat.");
                    } else {
                        System.out.println("Student has completed 2/3 of the coursework.");
                    }
                    break;
                case 2:
                    viewExamResults();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        // Calculate total score
        int[] coursework = { 10, 10, 10, 10, 10 };
        // Example coursework results
        int totalCoursework = 0;
        for (int mark : coursework) {
            totalCoursework += mark;
        }
        int finalExam = 40; // Example final exam score
        int totalScore = totalCoursework + finalExam;
        System.out.println("Total score: " + totalScore + "/100");
    }

    // Simulate getting user choice
    private static int getUserChoice() {
        // Simulate user input for testing purposes
        return 1;
        // Return a valid choice for testing, e.g., 1, 2, or 3
    }
}
