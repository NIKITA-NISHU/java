package reversewithoutmethod;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,2,3,4,5};
	        int[] rev = new int[arr.length];

	        for(int i=0; i < arr.length; i++) {
	            rev[i] = arr[arr.length - i - 1];
	        }

	        System.out.println();
	        for(int i=0; i < rev.length; i++) {
	            System.out.print(rev[i] + " ");
	        }
	}
}