package Epam.CleanCode;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class simpleinterest {
		
		
		public static void simpleInterestCalculator() {
		Scanner scan= new Scanner(System.in);
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.print("enter principle amount :");
		try {
			double pAmt = scan.nextDouble();
			p.println("Enter time period");
			double time = scan.nextDouble();
			p.println("Enter  rate of interest per year");
			double RateOfInterest = scan.nextDouble();
			double simpleIntrest = (pAmt * time * RateOfInterest) / 100;
			double compoundIntrest = (pAmt * Math.pow(1 + (RateOfInterest/100), time)) - pAmt;
			p.println("Simple Interest  :" + simpleIntrest+"Rs");
			p.println("Compound Interest  :"+ compoundIntrest+"Rs");
		}
		catch(Exception e) {
			p.println("Invalid input!\nEnter the valid one!");
		}
	}

	}


