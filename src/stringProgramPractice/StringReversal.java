package stringProgramPractice;

public class StringReversal {
	


	public static void main(String[] args) {
		String Orginal = "I am confident";
		String reverse = reverseString(Orginal);
		System.out.println("Orginal String: " +Orginal);
		System.out.println("Reversed String: "+reverse);
		
		

	}
	public static String reverseString(String str)
	{
		StringBuilder reversed = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

}
