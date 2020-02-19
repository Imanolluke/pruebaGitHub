package test;

public class ArrayTest {

	public static void main(String[] args) {
		
		int counter=0;
		
		int[] numbers = new int[4];
		numbers[0] = 0;
		numbers[1] = 5;
		numbers[2] = 75;
		numbers[3] = 1000;
		numbers[4] = 1200;
		numbers[5] = 1200;
		
		
		while (counter < numbers.length) {
			System.out.println("in position "+ counter + ":" + numbers[counter]);
			counter++;
		}
		System.out.println("");
		
		String[] names = {"Eneko","Gerardo","Xabi"};
		
		counter=0;
		while (counter < names.length) {
			System.out.println("in position "+ counter + ":" + names[counter]);
			counter++;

	}
	}
}
