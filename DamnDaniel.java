import java.util.*;

class Prelim {
    Scanner stab = new Scanner(System.in);
    int signment;
    int proyekt;
    int finExam;
    double lastSurprise;

    int check1;
    int check2;
    int check3;

    public void inputScores() {
        while (check1 < 100 || check2 < 100 || check3 < 100) {
            while (check1 < 100) {
                System.out.print("Enter Assignment Score (out of 100): ");
                signment = Integer.valueOf(stab.nextLine());

                if (signment < 0 || signment > 100) {
                    System.out.println("\nAssignment Score is outside of alloted parameters.");
                    System.out.println("Restarting Input Phase.\n");
                    check1 = 0;
                }
                if (signment >= 0 && signment <= 100) {
                    check1 += 100;
                }
                while (check1 >= 100 && check2 < 100) {
                    System.out.print("Enter Project Score (out of 100): ");
                    proyekt = Integer.valueOf(stab.nextLine());

                    if (proyekt < 0 || proyekt > 100) {
                        System.out.println("\nProject Score is outside of alloted parameters.");
                        System.out.println("Restarting Input Phase.\n");
                        check1 = 0;
                    }
                    if (proyekt >= 0 && proyekt <= 100) {
                        check2 += 100;
                    }
                    while (check2 >= 100 && check3 < 100) {
                        System.out.print("Enter Final Exam Score (out of 100): ");
                        finExam = Integer.valueOf(stab.nextLine());

                        if (finExam < 0 || finExam > 100) {
                            System.out.println("\nFinal Exam Score is outside of alloted parameters.");
                            System.out.println("Restarting Input Phase.\n");
                            check1 = 0;
                            check2 = 0;
                        }
                        if (finExam >= 0 && finExam <= 100) {
                            check3 += 100;
                        }
                    }
                }
            }
        }
        check1 = 0;
        check2 = 0;
        check3 = 0;
    }

    public void calculateFinalGrade() {
        this.lastSurprise = ((signment * .3) + (proyekt * .4) + (finExam * .3));
        System.out.println(lastSurprise);
    }

    public void determineResult() {
        if (lastSurprise < 70) {
            System.out.println("Status: Failed\n");
        } else {
            System.out.println("Status: Passed\n");
        }
    }
}

public class DamnDaniel {
    public static void main(String[] args) {
        Prelim dang = new Prelim();
        Scanner stAmount = new Scanner(System.in);

        System.out.print("How many students are being graded?: ");
        int n = Integer.valueOf(stAmount.nextLine());

        for (int i = 1; i < n + 1; i++) {
            System.out.println("Student #" + i + "'s Scores are: ");
            dang.inputScores();

            System.out.println("\nResults:");

            dang.calculateFinalGrade();
            dang.determineResult();
        }

        System.out.println("All student grades have been calculated. \nThank you for using this program. Goodbye.");
    }
}