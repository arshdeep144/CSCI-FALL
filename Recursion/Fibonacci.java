import java.util.*;
public class Fibonacci{
	private static int count = 0;
	public static void main(String[] args) {
		System.out.println("Fibonacci:" );
		int n = 15;
		resetCallCount();
		int recursiveResult = fibonacciRec(n);
		int recursiveCalls = getCallCount();
		System.out.printf("Recursive result: %d (%d recursive calls)\n",
						   recursiveResult, recursiveCalls);
		resetCallCount();
		int iterativeResult = fibonacciIter(n);
		int iterations = getCallCount();
		System.out.printf("Iterative result: %d (%d iterations)\n",
							   iterativeResult, iterations);
	}

	public static int fibonacciRec(int n){
		if (n==0 || n==1){
			count++;
			return n;
		}
		else{
			count++;
			return (fibonacciRec(n-2) + fibonacciRec(n-1));
		}
	}
	public static int fibonacciIter(int n){
		if (n==0 || n==1){
			count++;
			return n;
		}
		int fib = 0;
		int fib2= 1;

		for(int i =1; i <n; i++){
			count++;
			int temp = fib2;
			fib2 = fib + fib2;
			fib = temp;

		}
		return fib2;
	}
	public static int getCallCount(){
		return count;
	}
	public static void resetCallCount(){
		count = 0;
	}
}