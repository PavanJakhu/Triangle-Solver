/**
* CLASS TRIANGLE
 * Contains the side lengths and angles of all the solutions of a triangle (can be 0, 1, or 2)
 * Constructs the triangle by solving a triangle according to case type (i.e. SSS, SAS, ASA, SAA, SSA) via trigonometry
 * Contains error checking methods
 * Contains perimeter and area fetching methods
 * @author Clement Hoang and Pavan Jakhu
 */
public class Triangle {
  private double A1, B1, C1; //these fields represent the angles of first solution of  the triangle
	private double A2, B2, C2; //these fields represent the angles of the second solution of the triangle
	private double a1, b1, c1; //these fields represent the sides of first solution of  the triangle
	private double a2, b2, c2; //these fields represent the sides of second solution of  the triangle
	/**
	 * constructs an object Triangle by performing a series of calculations based on the parameters given
	 * it assigns all the fields in the triangle their appropriate values
	 * <p>
	 * @param double A, double B, double C, double a, double b, double c – represents                  
	 * angle A, angle B, angle C, side a, side b, and side c respectively
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public Triangle (double A, double B, double C, double a, double b, double c) {
		//the instance fields of the first solution are set to their corresponding parameter values
		A1 = A;
		B1 = B;
		C1 = C;
		a1 = a;
		b1 = b;
		c1 = c;
		if (a!=0 && b!=0 && c!=0) //SSS case
			SSS();
		else if ((A1!=0 && B1!=0 && C1==0)||(A1!=0 && B1==0 && C1!=0)||(A1==0 && B1!=0 && C1!=0))//AAS or ASA case
			AASorASA();
		else if (A1!=0 && B1!=0 && C1!=0) { //AAAS case
			A1 = 0; //sets one angle to zero, then solves as an AAS case
			AASorASA();
		}
		else if ((A!=0&&a==0)||(B1!=0&&b==0)||(C1!=0&&c==0)) //SAS case
			SAS();
		else  //SSA case
			SSA();
	}
	/**
	 * returns the value of the angle A of the first solution
	 * <p>
	 * @return angle A1
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getA1() {return A1;}
	/**
	 * returns the value of the angle B of the first solution
	 * <p>
	 * @return angle B1
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getB1() {return B1;}
	/**
	 * returns the value of the angle C of the first solution
	 * <p>
	 * @return angle C1
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getC1() {return C1;}
	/**
	 * returns the value of the side a of the first solution
	 * <p>
	 * @return side a1
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double geta1() {return a1;}
	/**
	 * returns the value of the side b of the first solution
	 * <p>
	 * @return side b1
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getb1() {return b1;}
	/**
	 * returns the value of the side c of the first solution
	 * <p>
	 * @return side c1
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getc1() {return c1;}
	/**
	 * returns the value of the angle A of the second solution
	 * <p>
	 * @return angle A2
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getA2() {return A2;}
	/**
	 * returns the value of the angle B of the second solution
	 * <p>
	 * @return angle B2
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getB2() {return B2;}
	/**
	 * returns the value of the angle C of the second solution
	 * <p>
	 * @return angle C2
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getC2() {return C2;}
	/**
	 * returns the value of the side a of the second solution
	 * <p>
	 * @return side a2
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double geta2() {return a2;}
	/**
	 * returns the value of the side b of the second solution
	 * <p>
	 * @return side b2
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getb2() {return b2;}
	/**
	 * returns the value of the side c of the second solution
	 * <p>
	 * @return side c2
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getc2() {return c2;}
	/**
	 * stores the value that is received as a parameter into A1
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putA1(double x) {A1 = x;}
	/**
	 * stores the value that is received as a parameter into B1
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putB1(double x) {B1 = x;}
	/**
	 * stores the value that is received as a parameter into C1
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putC1(double x) {C1 = x;}
	/**
	 * stores the value that is received as a parameter into a1
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void puta1(double x) {a1 = x;}
	/**
	 * stores the value that is received as a parameter into b1
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putb1(double x) {b1 = x;}
	/**
	 * stores the value that is received as a parameter into c1
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putc1(double x) {c1 = x;}
	/**
	 * stores the value that is received as a parameter into A2
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putA2(double x) {A2 = x;}
	/**
	 * stores the value that is received as a parameter into B2
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putB2(double x) {B2 = x;}
	/**
	 * stores the value that is received as a parameter into C2
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putC2(double x) {C2 = x;}
	/**
	 * stores the value that is received as a parameter into a2
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void puta2(double x) {a2 = x;}
	/**
	 * stores the value that is received as a parameter into b2
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putb2(double x) {b2 = x;}
	/**
	 * stores the value that is received as a parameter into c2
	 * <p>
	 * @param double x
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void putc2(double x) {c2 = x;}
	/**
	 * solves the triangle when given an AAS or ASA case
	 * <p>
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void AASorASA() {
		//calculates the remaining angle
		if (A1 == 0)
			A1 = 180 - B1 - C1;
		else if (B1 == 0)
			B1 = 180 - A1 - C1;
		else
			C1 = 180 - A1 - B1;
		//calculates the other two sides using the sine law twice
		if (a1!=0) {
			b1 = Math.sin(Math.toRadians(B1))*(a1/Math.sin(Math.toRadians(A1)));
			c1 = Math.sin(Math.toRadians(C1))*(a1/Math.sin(Math.toRadians(A1)));
		}
		else if (b1!=0) {
			a1 = Math.sin(Math.toRadians(A1))*(b1/Math.sin(Math.toRadians(B1)));
			c1 = Math.sin(Math.toRadians(C1))*(b1/Math.sin(Math.toRadians(B1)));
		}
		else {
			b1 = Math.sin(Math.toRadians(B1))*(c1/Math.sin(Math.toRadians(C1)));
			a1 = Math.sin(Math.toRadians(A1))*(c1/Math.sin(Math.toRadians(C1)));	
		}
	}
	/**
	 * solves the triangle given a SAS case
	 * <p>
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void SAS() {
		//finds out the remaining side of the triangle
		if (a1 == 0) 
			a1 = Math.sqrt(b1*b1 + c1*c1 - 2*b1*c1*Math.cos(Math.toRadians(A1)));
		else if (b1 == 0) 
			b1 = Math.sqrt(a1*a1 + c1*c1 - 2*a1*c1*Math.cos(Math.toRadians(B1)));
		else
			c1 = Math.sqrt(a1*a1 + b1*b1 - 2*a1*b1*Math.cos(Math.toRadians(C1)));
		//calculates the remaining two angles of the triangle using cosine law then triangle sum law
		//not in an else-if structure because more than 1 case can be valid
		if (A1 != 0) {
			B1 = Math.toDegrees(Math.acos(((a1*a1+c1*c1-b1*b1)/(2*a1*c1))));
			C1 = 180 - A1 - B1;
		}
		if (B1 != 0) {
			C1 = Math.toDegrees(Math.acos(((a1*a1+b1*b1-c1*c1)/(2*a1*b1))));
			A1 = 180 - B1 - C1;
		}
		if (C1 != 0) {
			A1 = Math.toDegrees(Math.acos(((b1*b1+c1*c1-a1*a1)/(2*b1*c1))));
			B1 = 180 - A1 - C1;
		}
	}
	/**
	 * solves the triangle when given a SSA case 
	 * <p>
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void SSA() {
		double solutions = solutions(a1, b1, c1, A1, B1, C1); //variable that holds whether there are 1 or 2 solutions 
		double sideUnknown, sideKnown, sideKnown2; //variables that store the unknown side, known side, and second known side of the triangle
		double angleKnown, angleUnknown, angleUnknown2; //variables that store the known angle, unknown angle, and second unknown angle of the triangle
		double angleUnknownA, angleUnknown2A, sideUnknownA; //variables that store the unknown angle, second unknown angle, and unknown side of the ambiguous case
		double ratio; //a variable that holds the sine ratio which helps when using the sine law
		//the following selection structure initializes the fields of the triangles to the variables declared in the beginning of the method
		if (a1 != 0 && A1 != 0) { //a and A are given
			sideKnown = a1;
			angleKnown = A1;
			a2 = sideKnown;
			A2 = angleKnown;
			if (b1 != 0) {
				sideKnown2 = b1;
				b2 = sideKnown2;
			}
			else {
				sideKnown2 = c1;
				c2 = sideKnown2;
			}
		}
		else if (b1 != 0 && B1 != 0) { //b and B are given
			sideKnown = b1;
			angleKnown = B1; 
			b2 = sideKnown;
			B2 = angleKnown;
			if (a1 != 0) {
				sideKnown2 = a1;
				a2 = sideKnown2;
			}
			else {
				sideKnown2 = c1;
				c2 = sideKnown2;
			}
		}
		else { //c and C are given
			sideKnown = c1; 
			angleKnown = C1; 
			c2 = sideKnown; 
			C2 = angleKnown;
			if (b1 != 0) {
				sideKnown2 = b1;
				b2 = sideKnown2;
			}
			else {
				sideKnown2 = a1;
				a2 = sideKnown2;
			}
		}
		//performs calculations to solve the unknown sides and angles of the first solution
		ratio = Math.sin(Math.toRadians(angleKnown))/sideKnown;
		angleUnknown = Math.toDegrees(Math.asin(ratio*sideKnown2));
		angleUnknown2 = 180 - angleUnknown - angleKnown;
		sideUnknown = Math.sin(Math.toRadians(angleUnknown2))/ratio;
		//performs calculations to solve the unknown sides and angles of the second solution (even if the triangle created is non-existent)
		angleUnknownA = 180 - Math.toDegrees(Math.asin(ratio*sideKnown2));
		angleUnknown2A = 180 - angleUnknownA - angleKnown;
		sideUnknownA = Math.sin(Math.toRadians(angleUnknown2A))/ratio;
		//the temporary variables are then re-assigned to their appropriate instance fields
		if (a1 != 0 && A1 != 0) { 
			if (b1 == 0) { //acA was initially given
				b1 = sideUnknown;
				C1 = angleUnknown;
				B1 = angleUnknown2;
				b2 = sideUnknownA;
				C2 = angleUnknownA;
				B2 = angleUnknown2A;
			}
			else { //abA was initially given
				c1 = sideUnknown;
				B1 = angleUnknown; 
				C1 = angleUnknown2;
				c2 = sideUnknownA;
				B2 = angleUnknownA; 
				C2 = angleUnknown2A;
			}
		}
		else if (b1 != 0 && B1 !=0) {
			if (a1 == 0) { //bcB was initally given
				a1 = sideUnknown;
				C1 = angleUnknown;
				A1 = angleUnknown2;
				a2 = sideUnknownA;
				C2 = angleUnknownA;
				A2 = angleUnknown2A;
			}
			else {  //baB was initially given
				c1 = sideUnknown;
				A1 = angleUnknown; 
				C1 = angleUnknown2;
				c2 = sideUnknownA;
				A2 = angleUnknownA; 
				C2 = angleUnknown2A;
			}
		}
		else if (c1 != 0 && C1 !=0) {
			if (a1 == 0) { //cbC was initially given
				a1 = sideUnknown;
				B1 = angleUnknown;
				A1 = angleUnknown2;
				a2 = sideUnknownA;
				B2 = angleUnknownA;
				A2 = angleUnknown2A;
			}
			else { //caC was initially given
				b1 = sideUnknown;
				A1 = angleUnknown; 
				B1 = angleUnknown2;
				b2 = sideUnknownA;
				A2 = angleUnknownA; 
				B2 = angleUnknown2A;
			}
		}
		if (solutions == 1) { //if only 1 solution exists, all the values calculated for the 2nd solution are reset
			A2 = 0;
			B2 = 0;
			C2 = 0;
			a2 = 0;
			b2 = 0;
			c2 = 0;
		}
	}
	/**
	 * solves the triangle when given 3 sides
	 * <p>
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public void SSS() {
		//cosine law three times to find each side
		A1 = Math.toDegrees(Math.acos(((b1*b1+c1*c1-a1*a1)/(2*b1*c1))));
		B1 = Math.toDegrees(Math.acos(((a1*a1+c1*c1-b1*b1)/(2*a1*c1))));
		C1 = Math.toDegrees(Math.acos(((a1*a1+b1*b1-c1*c1)/(2*a1*b1))));
	}
	/**
	 * Returns the amount of solutions that exist in the triangle given the specifications specified in the parameters
	 * <p>
	 * @param double a, double b, double c, double A, double B, double C, the side lengths and the angles of the triangle respectively
	 * @return number of solutions of type int (can be 0, 1, or 2)
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public static double solutions(double a, double b, double c, double A, double B, double C) {
		double temp = 1; //variable that stores number of solutions (default is 1)
		double angleCount = 3; //count of the number of real angles specified in parameter 
		double sideCount = 3; //count of the number of real sides specificed in parameter
		double h; //variable which will hold the height of the triangle
		double s1 = 0, s2 = 0, angle = 0; //variables which will hold side 1, side 1, and an angle which will be used to determine solution variance in SSA cases
		//the following calculates the amount of angles and sides specified by user in parameter
		if (a == 0) {sideCount--;}
		if (b == 0) {sideCount--;}
		if (c == 0) {sideCount--;}
		if (A == 0) {angleCount--;}
		if (B == 0) {angleCount--;}
		if (C == 0) {angleCount--;}
		if (angleCount == 2 && A+B+C >= 180)  //checks if there are no 2 obtuse angles, no 2 right angles, and sum of 2 angles less than 180 when 2 angles are given
			temp = 0;
		if (angleCount == 3 && A + B + C != 180)  //checks whether the the angles add up to 180 when 3 are given
			temp = 0;
		else if (sideCount ==2) { //2 side lengths are given
			//the following sets s1, s2, and angle to certain values to determine if there are 0, 1, or 2 solutions in a SSA case
			if (a!=0&&b!=0&&A!=0) { //abA
				s1 = a;
				s2 = b;
				angle = A;
			}
			else if (b!=0&&c!=0&&B!=0) { //bcB
				s1 = b;
				s2 = c;
				angle = B;
			}
			else if (c!=0&&a!=0&&C!=0) { //caC
				s1 = c;
				s2 = a;
				angle = C;
			}
			else if (b!=0&&a!=0&&B!=0) { //baB
				s1 = b;
				s2 = a;
				angle = B;
			}
			else if (c!=0&&b!=0&&C!=0) { //cbC
				s1 = c;
				s2 = b;
				angle = C;
			}
			else if (a!=0&&c!=0&&A!=0) { //acA
				s1 = a;
				s2 = c;
				angle = A;
			}
			if (s1!=0 && s2!= 0 && angle!=0) { //only performs these calculations in the case of an SSA triangle
				h = s2*Math.sin(Math.toRadians(angle));
				//checks are based off of this:
				//http://jwilson.coe.uga.edu/emt668/emat6680.2001/mealor/emat%206700/law%20of%20sines/law%20of%20sines%20ambiguous%20case/lawofsinesambiguouscase.html
				if (angle<90 && s1<h)
					temp = 0;
				else if (angle<90 && h<s1 && s1<s2)
					temp = 2;
				else if (angle>90 && s1<=s2)
					temp = 0;
			}	
		}
		
		else if (sideCount == 3) { //if 3 sides are given, it ensures that no side is longer than the sum of the other 2
			if ((a+b <= c)||(a+c <= b)||(b+c <= a)) {
				temp = 0;
			}
		}
		return temp; //returns number of solutions
	}	
	/**
	 * calculates and returns the perimeter of the first solution of the triangle
	 * <p>
	 * @return perimeter of the first solution of the triangle
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getPerimeter1() {
		return a1+b1+c1; //sum of all sides
	}
	/**
	 * calculates and returns the perimeter of the second solution of the triangle
	 * <p>
	 * @return perimeter of the second solution of the triangle
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getPerimeter2() {
		return a2+b2+c2; //sum of all sides
	}
	/**
	 * calculates and returns the area of the first solution of the triangle
	 * <p>
	 * @return area of the first solution of the triangle
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getArea1() {
		double s=getPerimeter1()/2;
		return Math.sqrt(s*(s-a1)*(s-b1)*(s-c1)); //Heron's law to find area
	}
	/**
	 * calculates and returns the area of the second solution of the triangle
	 * <p>
	 * @return area of the second solution of the triangle
	 * @author Clement Hoang and Pavan Jakhu
	 */
	public double getArea2() {
		double s=getPerimeter2()/2;
		return Math.sqrt(s*(s-a2)*(s-b2)*(s-c2)); //Heron's law to find area
	}
}
