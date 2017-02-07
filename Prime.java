
import java.util.Scanner;

public class Prime {
	private static final int factor1 = 2;
	private static final int factor2 = 3;
	private static final int factor3 = 5;
	private static final int factor4 = 7;

	private static boolean isPrime (int x){
		boolean result = true;
		if (x==factor1 || x==factor2 || x==factor3 || x==factor4){
			result = true;
		}
		else {
			for (int sFactor =2; sFactor<x/2; sFactor++){
				int res = x%sFactor;
				if (res == 0){
					result=false;
					break;
				}
			}
		
		}
		return result;
	}

	public static void main (String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("Please, provide an integer");
		int x = s.nextInt();
		s.close();
		boolean temp = isPrime(x);
		if (temp == true){
			System.out.println("The number " + x + " is prime.");
		}
		else{
			System.out.println("The number " + x + " is not prime.");
		}
	}
}
