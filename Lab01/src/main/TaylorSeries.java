package main;

public class TaylorSeries {
	public static double approximateExp(int i, int n) {
		double x = 0;
		for (int j=0;j<n;j++) {
			x= x+ (pow(i,j)/factorial(j));
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
