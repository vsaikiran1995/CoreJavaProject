package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30};
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		System.out.println(arr1[arr1.length-1]);
		
		String[] arr2= {"Mon","Tue","Wed","Thu","Fri"};
		System.out.println("Value at the third position is: "+arr2[2]);
		
		String str="Clean World Green World";
		String[] arr3=str.split(" ");
		System.out.println(arr3.length);
		System.out.println(arr1);//Not correct way to print array of numbers

	}

}
