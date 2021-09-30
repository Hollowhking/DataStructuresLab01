package main;

public class TaylorSeries {
	public static double approximateExp(int i, int n) {
		double x = 0;
		for (int liam=0;liam<n;liam++) {
			x= x+ (pow(i,liam)/factorial(liam));
		    //System.out.println(pow(i,liam)+"   "+factorial(liam));
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
