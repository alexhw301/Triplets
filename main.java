import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException {
		int threshold; //total amount they can equal up to
		int size; //size of list
		long combinations; //how many possible combos meet the requirements
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("integer threshold t = ");
		threshold = scanner.nextInt();
		
		System.out.println("size of d[] n = ");
		size = scanner.nextInt();
		int[] list = new int[size]; //create int array with size user gave
		
		System.out.println("d = "); 
		for (int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt(); //user inputs value of each element in array
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " "); //print list user just gave (for testing)
		}
		System.out.print("\n"); //move a line down
		
		combinations = triplets(threshold, list);
		System.out.println(combinations);
	}
	
	static long triplets(long t, int[] d) {
		int counter = 0;
		
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				for (int k = 0; k < d.length; k++) {
					if(d[i] < d[j] && d[j] < d[k]) { //checks less-than condition
						if(d[i]+d[j]+d[k] <= t) { //checks threshold condition
							counter++; //increment if meets all conditions
						}
					}
				}
			}
		}
		
		return counter;
	}
}