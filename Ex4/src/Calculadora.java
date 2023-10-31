
public class Calculadora {

	private String result;
	
	public Calculadora() {
		result = "";
	}
	
	public static String calculate(String operation, String num1, String num2) {
		
		double result = 0.0;
		
		try {			
			double oper1 = Double.parseDouble(num1);
			double oper2 = Double.parseDouble(num2);
			
			switch (operation) {
			case "+":
				result = suma(oper1, oper2);
				break;
				
			case "-":
				result = resta(oper1, oper2);
				break;
				
			case "x":
				result = multiplicacion(oper1, oper2);
				break;
				
			case "/":
					
				if (oper2 == 0.0) {
					throw new NumberFormatException();
				}
				result = division(oper1, oper2);

				
				break;
			default:
				System.out.println("Error");
			}
			return(Double.toString(result)); 
			
		} catch (NumberFormatException  nfe) {
			return("Error");
		}
	}
	
	private static double suma(double op1, double op2) {
		return op1 + op2;
	}
	
	private static double resta(double op1, double op2) {
		return op1 - op2;
	}
	
	private static double multiplicacion(double op1, double op2) {
		return op1 * op2;
	}
	
	private static double division(double op1, double op2) {
		return op1 / op2;
	}
}
