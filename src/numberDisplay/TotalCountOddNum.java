package numberDisplay;

public class TotalCountOddNum {

	public static void main(String[] args) {
		int count = 0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		
		System.out.println("The Count of Odd Numbers are:" +count);

	}

}
