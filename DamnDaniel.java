import java.util.*;

class Prelim {
    Scanner stab = new Scanner(System.in);
    int signment;
    int proyekt;
    int finExam;
    double lastSurprise;
    
    public void inputScores() {
       System.out.print("Enter Assignment Score (out of 100): ");
       this.signment = Integer.valueOf(stab.nextLine());
        
       if (signment < 0 || signment > 100) {
            System.out.println("Assignment Score is outside of alloted parameters.");
            System.out.println("Ending Program.");
            System.exit(0);    
       }
        
       System.out.print("Enter Project Score (out of 100): ");
       this.proyekt = Integer.valueOf(stab.nextLine());
        
       if (proyekt < 0 || proyekt > 100) {
            System.out.println("Project Score is outside of alloted parameters.");
            System.out.println("Ending Program.");
            System.exit(0);
       }
        
       System.out.print("Enter Final Exam Score (out of 100): ");
       this.finExam = Integer.valueOf(stab.nextLine());
       
       if (finExam < 0 || finExam > 100) {
            System.out.println("Final Exam Score is outside of alloted parameters.");
            System.out.println("Ending Program.");
            System.exit(0);
       }    
    }
    
    public void calculateFinalGrade() {
        this.lastSurprise = ((signment * .3) + (proyekt * .4) + (finExam * .3));
        System.out.println(lastSurprise);
    }
    
    public void determineResult() {
        if (lastSurprise < 70) {
            System.out.println("Result: Failed\n");
        } else {
            System.out.println("Result: Passed\n");
        }
    }
}

public class DamnDaniel {
	public static void main(String[] args) {
		Prelim dang = new Prelim();
		Scanner stAmount = new Scanner(System.in);
		
		System.out.print("How many students are being graded?: ");
		int n = Integer.valueOf(stAmount.nextLine());
		
		for (int i = 1; i < n+1; i++) {
		System.out.println("Student #" + i + "'s grades are: ");
		dang.inputScores();
		
		System.out.println("\nResults:");
		
		dang.calculateFinalGrade();
		dang.determineResult();
		}
		
		System.out.println("All grades have been calculated. \nEnding Program.");
	}
}