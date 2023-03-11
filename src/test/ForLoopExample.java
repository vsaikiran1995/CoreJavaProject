package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("End of For Loop");

		for (int i = 10; i > 0; i--) {
			if (i == 5) {
				System.out.println(" ");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("End of Second For Loop");

		int[] arr = { 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		
		for(int val:arr) {
			System.out.println(val);
		}
		
		

	}

}
