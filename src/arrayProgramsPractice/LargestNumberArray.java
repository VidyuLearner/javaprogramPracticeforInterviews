package arrayProgramsPractice;

public class LargestNumberArray {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,4,8,9};
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
System.out.println("The given array is:");
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
System.out.println("From array the largest number is: "+max);
	}

}
