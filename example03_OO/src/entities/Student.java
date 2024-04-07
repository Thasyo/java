package entities;

public class Student {

	public String name;
	public double grade01;
	public double grade02;
	public double grade03;
	
	
	public double finalGrade() {
		
		return grade01 + grade02 + grade03;
		
	}
	
	public String toString() { 
		
		if(finalGrade() >= 60) {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nPASS.";
		}else {
			
			double missing = 60 - finalGrade();
			
			return "FINAL GRADE = " + String.format("%.2f", finalGrade())
			+ "\nFAILED." 
			+ "\nMISSING " + String.format("%.2f", missing) + " POINTS.";
		}
		
	}
	
}
