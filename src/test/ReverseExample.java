package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "nitin";
		String result = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			result = result + str1.charAt(i);

		}
		System.out.println(result);
		if (str1.equalsIgnoreCase(result)) {
			System.out.println("given string is palindrome");
		} else
			System.out.println("given string is not palindrome");

		
		//reverse of a statement
		String str2 = "david meets john and lilly";
		String[] arr = str2.split(" ");
		String result3 = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result3 = result3 + arr[i] + " ";
		}
		System.out.println(result3.trim());

	}

}
