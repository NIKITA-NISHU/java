package arrays;

public class arrayslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		String str = "45393";

		for(int i = 0; i < str.length(); i++) {
		  int val = Character.getNumericValue(str.charAt(i));
		  max = Math.max(max, val);
		}

		System.out.println(max); //prints 9
	}

}
