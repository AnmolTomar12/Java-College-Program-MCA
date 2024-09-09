// Java Program to Find Student Grade
import java.util.*;
public class StudentGrade{
	//private static Scanner sc;
	public static void main(String[] args) 
	{
	    int boys,girls,total;
	    float percentage;
		sc = new Scanner(System.in);
		
		System.out.print(" Enter the no. of total student in class : ");
		total= sc.nextInt();
        System.out.print(" Enter the no. of boys in class : ");
	    boys= sc.nextInt();	

		girls = (total-boys);
	    percentage = (total / 2) - 20;
	 
	    System.out.println(" total girls in class =  " + girls);
	    System.out.println(" total number of girls getting grade 'A'. =  " + Percentage);
		
	}
}