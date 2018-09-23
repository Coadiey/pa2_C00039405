// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 260
// Programming Assignment : #2
// Due Date : 2/6/18 
// Program Description: knows how many students to ask for, asks student name, asks students score, keeps track of student name and score with best score, tells you the student with the best score
// Certificate of Authenticity:
// I certify that the code in the method function main of this project is entirely my own
// work.
package pa2_c00039405;

/**
 *
 * @author Coadiey Bryan
 */
public class Pa2_C00039405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numbStudents = keyboard.nextInt();
        String bestStudent = "";
        int bestScore = 0;
        for (int i = 0; i < numbStudents; i++) {
            System.out.println("Enter a student name:  ");
            String sName = keyboard.next();
            System.out.printf("Enter the score for %s: ", sName);
            int sScore = keyboard.nextInt();
            if (sScore > bestScore) {
                bestScore = sScore;
                bestStudent = sName;
            }
        }
        System.out.printf("Top Student: %s with a score of %d ", bestStudent, bestScore);
    }
}
