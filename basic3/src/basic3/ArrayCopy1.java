package basic3;

public class ArrayCopy1 {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========");
		
		int arr2[] = new int[5];
		
		for(int i=0;i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//for(int i=0;i<arr.length; i++) {
		//	arr2[i] = arr[i];
		//}
		
		System.out.println("=====System.arraycopy()========");
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		System.out.println("============");
		
		for(int i=0;i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
