// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int repetition = Integer.parseInt(args[0]);
		double divisor = 1;
		double sign = 1; 
		double approx = 0;
		System.out.println("pi according to Java: " + Math.PI);
		for (int count = 0; count < repetition; count++){
			double term = 1/divisor;
			term = term*sign; 
			approx = approx + term;
			divisor = divisor + 2;
			sign = sign*-1; 
		}
		System.out.println("pi, approximated:     " + (4*approx));
	}
}
