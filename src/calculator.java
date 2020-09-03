
public class calculator {
	private double num1;
	private double num2;
	private char sign;
	
	
	public char getSign() {
		return sign;
	}
	public void setSign(char sign) {
		this.sign = sign;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public void Plus(double num1,double num2) {
		double answer;
		answer=num1+num2;
		System.out.println(": "+answer);
		
	}
	public void Minus(double num1,double num2) {
		double answer;
		answer=num1-num2;
		System.out.println(": "+answer);
	}
	
	public void Multiply(double num1, double num2) {
		double answer;
		answer=num1*num2;
		System.out.println(": "+answer);
	}
	
	public void Divide(double num1,double num2) {
		double answer;
		answer=num1/num2;
		System.out.println(": "+answer);
	}
	
	public void Factorial(double num1) {
		double answer=1;
		for(int i=1;i<num1;i++) {
			answer=answer*i;
		}
		System.out.println(": "+answer);
		
	}


	
	

	

}
