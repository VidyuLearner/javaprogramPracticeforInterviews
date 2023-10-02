package arrayProgramsPractice;

public class DuplicateElement {

	public static void main(String[] args) {
	
		int[] arr1 = new int[] {1,2,3,4,5,4,3,2,6,6,7,7};
		System.out.println("Duplicate elements of given array ");
		// searches for duplicate values
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[j]);
					
				}
			}
		}
	}

}
