package Epam.CleanCode;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class construct {
public static void CostEstimation() {
		
		Scanner scan = new Scanner(System.in);
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.println("Choose one from the available materials..\n1. Construction with Standard materials\n2. Construction with above standard materials\n3. Construction with High standard materials\n4. Construction with High standard materials and fully automated home");
		try {
			int c = scan.nextInt();
			double HArea;
			switch(c) {
			case 1:
				p.println("Enter area of house in sqfts :");
				HArea = scan.nextDouble();
				p.println("Total estimated cost is " + (1200 * HArea)+"Rs");
				break;
			case 2:
				p.println("Enter area of house in sqfts :");
				HArea = scan.nextDouble();
				p.println("Total estimated cost is " + (1500 * HArea)+"Rs");
				break;
			case 3:
				p.println("Enter area of house in sqfts :");
				HArea = scan.nextDouble();
				p.println("Total estimated cost is " + (1800 * HArea)+"Rs");
				break;
			case 4:
				p.println("Enter area of house in sqfts :");
				HArea = scan.nextDouble();
				p.println("Total estimated cost is " + (2500 * HArea)+"Rs");
				break;
			default:
				p.println("Select from the above options!");
			}
		}
			catch(Exception e) {
				p.println("Invalid!!");
		}
		
	}
}
