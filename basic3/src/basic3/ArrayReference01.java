package basic3;

public class ArrayReference01 {

	public static void main(String[] args) {
		String arr[] = new String[3];
		arr[0]="hi1";
		arr[1]="hi1";
		arr[2]="hi1";
		System.out.println(arr);
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr[0]));
	}

}
