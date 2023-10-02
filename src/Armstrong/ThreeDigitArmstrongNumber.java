package Armstrong;

public class ThreeDigitArmstrongNumber {

	public static void main(String[] args) {
		int n, arg, sum = 0, r;
		
		n = 1111;
		arg = n;
		int len = String.valueOf(arg).length();
		for(int i=1;i<n;i++) {
			while(n>0)
			{
				r = n % 10;
				//sum = sum + (r*r*r);
				sum  = (int) (sum + Math.pow(r, len));
				n = n/10;
			}
		}
		
		if(sum == arg) {
			System.out.println("The given number is an Armstrong number: " +arg);
		}
		
		else {
			System.out.println("The given number is not an Armstrong number");
		}

	}

}
