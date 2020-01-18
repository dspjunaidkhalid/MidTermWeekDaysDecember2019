package math.problems;

import java.util.Scanner;

public class Pattern {
	/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.*/


	void display()
	{
		int n = 5;
		int space = n / 2, num = 1;

		// Outer for loop for
		// number of rows
		for (int i = 1; i <= n; i++)
		{
			// Inner for loop
			// for printing space
			for (int j = 1; j <= space; j++)
				System.out.print(" ");

			// Logic for printing
			// the pattern for everyline
			int count = num / 2 + 1;
			for (int k = 1; k <= num; k++)
			{
				System.out.print(count);
				// Value of count decrements
				// in every cycle
				if (k <= num /2 )
					count--;

					// Value of count will increment
					// in every cycle
				else
					count++;
			}

			System.out.println();

			// Befor reaching half Space is decreased
			// by 1 and num is increased by 2
			if (i <= n / 2)
			{
				space = space - 1;
				num = num + 2;
			}

			// After reaching to half space is increased
			// by 1 and num is decreased by 2
			else
			{
				space = space + 1;
				num = num - 2;
			}
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		Pattern p = new Pattern();
		p.display();
	}
}
