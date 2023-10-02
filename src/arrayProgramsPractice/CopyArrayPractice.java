package arrayProgramsPractice;

public class CopyArrayPractice {

	public static void main(String[] args) {
		int arr1[] = new int[] {1,2,3,4,5,6,7,8};
		int arr2[] = new int[arr1.length];
		
		//copying arr1 to arr2
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		
		

	}

}
