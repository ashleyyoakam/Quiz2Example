import java.util.Scanner;

public class TuitionCalculator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter percent increase between 1st and 2nd year: ");
		double interest1 = input.nextDouble();
		System.out.println("Enter percent increase between 2nd and 3rd year: ");
		double interest2 = input.nextDouble();
		System.out.println("Enter percent increase between 3rd and 4th year: ");
		double interest3 = input.nextDouble();
		
		System.out.println("Enter initial tution: ");
		double tuition = input.nextDouble();
		
		double convertedrate1=(interest1/100)+1;
		double convertedrate2=(interest2/100)+1;
		double convertedrate3=(interest3/100)+1;
		
		double year2amount = convertedrate1*tuition;
		double year3amount = convertedrate2*year2amount;
		double year4amount = convertedrate3*year3amount;

		double totalTuition = tuition+year2amount+year3amount+year4amount;
		
		System.out.printf("The total tuition will be $%5.2f" + ".", totalTuition);
		
	}
	
}
