import java.util.Scanner;

public class TuitionCalculator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter percent increase each year: ");
		double interest1 = input.nextDouble();
		
		
		System.out.println("Enter initial tution: ");
		double tuition = input.nextDouble();
		
		double convertedrate1=(interest1/100)+1;
	
		
		double year2amount = convertedrate1*tuition;
		double year3amount = convertedrate1*year2amount;
		double year4amount = convertedrate1*year3amount;

		double totalTuition = tuition+year2amount+year3amount+year4amount;
		
		System.out.printf("The total tuition will be $%5.2f" + ".", totalTuition);
		
	}
	
}
