/*
 * Program to print a pattern using loops
 */
public class Assign3 {

	public static void main(String[] args) {

		int counterInner;
		int pyramidSize;

		for (pyramidSize = 1; pyramidSize <= 5; pyramidSize++) {

			for (counterInner = 1; counterInner <= pyramidSize; counterInner++) {
				System.out.print(counterInner);
			}
			System.out.print("\n");
		}
		for (pyramidSize = 1; pyramidSize <= 4; pyramidSize++) {

			for (counterInner = 1; counterInner <= (5-pyramidSize ); counterInner++) {
				System.out.print(counterInner);
			}
			System.out.print("\n");
		}

	}

}
