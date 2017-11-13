/*
  	ISYS 320
  	Name(s):
  	Date: 
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| BANGS 	| SLASHES 	|
	1				22			0			         
	2				18			4			
	3				14			8			
	4				10			12			
	5				6			16			
	6				2			20			

*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 For each line of 6 lines,
 starting with 22 bangs and 0 slashes,
 decrease the bangs, and increase the slashes, by 4
 so that the output looks like this:
 Write 0 slashes, 22 bangs, and 0 slashes
 Go to next output line
 Write 2 slashes, 18 bangs, and 2 slashes
 Go to next output line
 Write 4 slashes, 14 bangs, and 4 slashes
 Go to next output line
 Write 6 slashes, 10 bangs, and 6 slashes
 Go to next output line
 Write 8 slashes, 6 bangs, and 8 slashes
 Go to next output line
 Write 10 slashes, 2 bangs, and 10 slashes
 */

public class P2_SlashesAndBangs {

	public static void main (String[] args) {
		for (int line = 6; line >= 1; line--) {
			for (int i = 1; i <= (2 * (6 - line)); i++) { // write slashes
				System.out.print("/");
			}	
			for (int i = 1; i <= (4 * line - 2); i++) { // write bangs
				System.out.print("!");
			}
			for (int i = 1; i <= (2 * (6 - line)); i++) { // write slashes
				System.out.print("/");
			}
			System.out.println();
		}
	}
}

