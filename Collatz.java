// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int seed = Integer.parseInt(args[0]);
		String mode = (args[1]);
		String verbose = "v";
		String consice = "c";
		if(mode.equals(verbose)) {
			for (int i = 1; i <= seed; i++) {
				int currentNum = i;
				int steps = 0;
				System.out.print(i + " "); 
				
				do {
					if (currentNum != i) {
						System.out.print(currentNum + " "); 
					}
					if (currentNum % 2 == 0) {
						currentNum = currentNum / 2;
					} else {
						currentNum = (currentNum * 3) + 1;
					}
					steps++;
				} while (currentNum != 1);
				
				System.out.print("1 ");
				steps++;

				System.out.print("(" + steps + ")");
				System.out.println();
			}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		if (mode.equals(consice)){
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		} 
    }
}
