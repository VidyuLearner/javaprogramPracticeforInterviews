package numberDisplay;

public class SumOfOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				sum = sum + i;
			}
		}
		
		System.out.println("The Sum of 100 Odd Numbers are:" +sum);

	}

}
