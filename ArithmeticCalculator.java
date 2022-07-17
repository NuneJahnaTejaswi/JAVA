package helloworld;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
			Scanner obj= new Scanner(System.in);
			System.out.println("CALCULATOR");
			int n1=0,n2=0;
			int option;
	
			while(true) {
				System.out.println("Enter your option:\n 1 for Addition\n 2 for substraction\n 3 for Multiplication\n 4 for division\n 5 for Exit");
				option = obj.nextInt();
				if(option == 5) {
					break;
				}
				if(option >= 0 && option<= 4) {
					System.out.println("Enter first number:");
					n1 = obj.nextInt();
					System.out.println("Enter second number:");
					n2 = obj.nextInt();
				}
				
				int res;
				switch(option) {
				case 1 :
					res = n1+n2;
					System.out.println("Addition is :"+ res);
					break;
				case 2 :
					res = n1-n2;
					System.out.println("Subtraction is :"+ res);
					break;
				case 3 :
					res = n1*n2;
					System.out.println("Multiplication is :"+ res);
					break;
				case 4 :
					float num1=n1;
		        	float num2=n2;
					if(n2==0) {
						System.out.println("It is not possible");
						break;
					}
					System.out.println("Division is :"+(num1/num2));
					break;

				default:
					System.out.println("Wrong option \nChoose correct option");
					break;
				}
				
			}
		}

	}
