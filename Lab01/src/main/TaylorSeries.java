package main;

public class TaylorSeries {
	static double x;
	public static double approximateExp(int i, int n) {
		int Count=0;
		while (Count<=n) {
			x= x+ (pow(i,Count)/factorial(Count));
			Count++;
		}
		return x;
	}
	
	static double factorial(int n) {
	    if (n<=1) return 1;
	    else return n*factorial(n-1);
	}//factorial
	
	static double pow(int x, int n) {
		if (n<1) return 1;
		else return (x*pow(x,n-1));
	}//power
}