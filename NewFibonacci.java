/* This program creates a new Fibonacci sequence, where
 *i3 = i1+(i2*i2) */

import java.util.ArrayList;
public class NewFibonacci {

/* param:
 *first - first number of sequence
 *second - second number of sequence
 *num - last member of sequence that should be computed 
 *return - new Fibonacci sequence*/
	
	private static ArrayList<Long> newFib(long first, long second, long num){
		ArrayList<Long> res =new ArrayList<>();
		res.add(0, first);
		res.add(1, second);
		while(res.size() < num){
			for(int i = 0, j=1, k=2; i<=num-2 && j<num-1 && k<num; i++, j++, k++){
				long t1 = res.get(i) + (res.get(j)*res.get(j));
				res.add(k, t1);
			}
		}
		return res;
	}
	
	/* param:
	 *first - first number of sequence
	 *second - second number of sequence
	 *num - last member of sequence that should be computed 
	 *return - last number in a new Fibonacci sequence*/
	
	private static int newFib1 (int first, int second, int num){
		int newF = 0;
		ArrayList<Integer> res =new ArrayList<>();
		res.add(0, first);
		res.add(1, second);
		while(res.size() < num){
			for(int i = 0, j=1, k=2; i<=num-2 && j<=num-1 && k<num; i++, j++, k++){
				int t1 = res.get(i) + (res.get(j)*res.get(j));
				res.add(k, t1);
				newF = t1;
			}
		}
		return newF;
	}
	
	/* param:
	 *first - first number of sequence
	 *second - second number of sequence
	 *num - last member of sequence that should be computed 
	 *return - last number in a new Fibonacci sequence
	 *
	 *just one more way to compute*/
	
	private static long newFib2 (long first, long second, long num){
		long newF = 0;
		int count = 1;
		while (count <= num-2){
			long temp = first + (second*second);
			first = second;
			second = temp;
			count++;
			newF = temp;
		}	
		return newF;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Long> a = NewFibonacci.newFib(0, 1, 6);
		long b = NewFibonacci.newFib1(0, 1, 6);
		long c = NewFibonacci.newFib2(0, 1, 6);
		System.out.println(a);
		System.out.println("result is "+ b);
		System.out.println("result2 is " + c);
	}
}
