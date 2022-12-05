package week6;

public class gradesRecord {
	private int quiz1; 
	private int quiz2; 
	private int midtermExam;
	private int finalExam; 
	

	public gradesRecord(int quiz1, int quiz2, int midtermExam, int finalExam) {
		if((quiz1 < 100 && quiz1 > 0) || (quiz2 < 100 && quiz2 > 0) || (midtermExam < 100 && midtermExam > 0) || (finalExam < 100 && finalExam > 0)) {
			this.quiz1 = quiz1; 
			this.quiz2 = quiz2;
			this.midtermExam = midtermExam; 
			this.finalExam = finalExam;
		} else {
			System.out.println("The scores can be only between 0-100");
			System.exit(0);
		}
	}
	
	public double getQuizGrade() {
		return((this.quiz1 + this.quiz2) / 2) * 0.25;
	}
	
	public double getMidterm() {
		return this.midtermExam * 0.25;
	}
	
	public double getFinal() {
		return this.finalExam * 0.50;
	}
	
	public double getScore() {
		return getQuizGrade() + getMidterm() + getFinal();
	}
	
    public String letterGrade(double score) {
        if (score >= 90) {
            return "A";
        }
        else if (score < 90 && score >= 80) {
            return "B";
        }
        else if (score < 80 && score >= 70) {
            return "C";
        }
        else if (score < 70 && score >= 60){
            return "D";
        }
        else if (score > 60) {
            return "F";
        } else {
        	return "Invalid score";
        }
    }
    
    public String toString() {
        double score = getScore();
        return("Student Record:\nQuiz 1: " + this.quiz1 + "\nQuiz 2: " + this.quiz2 + "\nMidterm: " + this.midtermExam + "\nFinal:  " + this.finalExam
             + "\nScore: " + score + "\nLetter Grade: " + letterGrade(score));
    }   
}
