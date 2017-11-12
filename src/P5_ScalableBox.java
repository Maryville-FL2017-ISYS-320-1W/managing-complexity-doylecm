

/*
	ISYS 320
	Name(s):Chris Doyle
	Date: 11/12/2017
*/

public class P5_ScalableBox {
	
	public static final int SUB_HEIGHT = 10;
	public static final int SUB_WIDTH = 10;
	public static void main(String[] args) {

		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= SUB_WIDTH - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		for( int insideRowIndex = 1; insideRowIndex <= SUB_HEIGHT - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= SUB_WIDTH - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
