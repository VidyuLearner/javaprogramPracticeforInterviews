package palindrome;

public class NumberPalindrome {

	public static void main(String[] args) {
		int number = 134560, pal, reverse =0,n;
		pal = number;
		for(int i=1; i<number;i++) {
			
			while(number>0) {
				n = number%10;
				reverse = reverse*10 + n;
				number = number/10;
				
			}
			if(reverse == pal)
			{
				System.out.println("The given number is Palindrom: "+pal);
			}
			else {
				System.out.println("The given number is not a Palindrome: " +pal);
			}
		}

	}

}
