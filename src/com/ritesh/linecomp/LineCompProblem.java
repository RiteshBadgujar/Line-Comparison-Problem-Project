package com.ritesh.linecomp;

import java.util.Scanner;

public class LineCompProblem {
	   int x1;
	   int x2;
	   int y1;
	   int y2;
	   double length;
	
	public void LineInput(){
		Scanner scanner =new Scanner(System.in); 
		
		System.out.println("Enter The Number X1,Y1 And X2,Y2 Point For The Line : ");
	    x1=scanner.nextInt();
		x2=scanner.nextInt();
		y1=scanner.nextInt();
		y2=scanner.nextInt();
	}
	
	public double LineCalculate() {
		 return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}
	
	public  void Linecheck(LineCompProblem linecomproblem2) {
		if(this.LineCalculate() == linecomproblem2.LineCalculate()) {
			System.out.println("The line Are Equal");
		}
		else {
			System.out.println("The line Are Not Equal");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Wellcome To Line Comapison Computation Program");
		
		LineCompProblem linecomproblem = new LineCompProblem();
		LineCompProblem linecomproblem2 = new LineCompProblem();
		
		linecomproblem.LineInput();
		linecomproblem2.LineInput();
		linecomproblem.LineCalculate();
		linecomproblem2.LineCalculate();
		linecomproblem.Linecheck(linecomproblem2);
	}	
}