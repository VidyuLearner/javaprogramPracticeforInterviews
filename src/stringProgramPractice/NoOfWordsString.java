package stringProgramPractice;

public class NoOfWordsString {

	public static void main(String[] args) {
		String s = "I am thankful to God? yes or no?";
		int counter = 1;
		for(int i=1;i<s.length();i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
				counter++;
				
			}
		}
		System.out.println("Number of words in a String: "+counter);
	}

}
