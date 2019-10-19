package cse360assign3;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(16);
		calc.divide(4);
		calc.power(8);
		calc.divide(0);
		calc.subtract(1000);
		calc.power(-1);
		
		System.out.println( "Total: " + calc.getTotal() );
		System.out.println( "History: " + calc);
	}

}
