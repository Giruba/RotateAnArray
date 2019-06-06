import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Rotate an array");
		System.out.println("---------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int arraySize = scanner.nextInt();
			int[] arrayInput = new int[arraySize];
			for(int index = 0; index < arraySize; index++) {
				System.out.println("Enter the element");
				arrayInput[index] = scanner.nextInt();
			}
			System.out.println("Enter the number of times the array has to be rotated");
			int rotations = scanner.nextInt();
			PrintRotatedArray(arrayInput, rotations);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
	
	public static void PrintRotatedArray(int[] arrayInput, int rotations) {
		
		for(int rotation = 0; rotation < rotations; rotation++) {
			int startElement = arrayInput[0];
			for(int index = 0; index < arrayInput.length-1; index++) {
				arrayInput[index] = arrayInput[index+1];
			}
			arrayInput[arrayInput.length-1] = startElement;
		}
		
		System.out.println("The rotated array is as follows-------");
		for(int index = 0; index < arrayInput.length; index++) {
			System.out.print(arrayInput[index]+" ");
		}
	}
}
