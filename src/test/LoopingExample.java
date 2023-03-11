package test;

public class LoopingExample {
	public static void main(String[] args) {
		int num = 10;
		while (num > 0) {
			System.out.println(num);
			num--;
		}
		System.out.println("End of the decreament numbers");

		int num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1);
			num1++;
		}

		int num2 = 10;
		while (num2 > 0) {
			if (num2 == 5) {
				System.out.println(" ");
				num2--;
				continue;
			}
			System.out.println(num2);
			num2--;
		}
	}

}
