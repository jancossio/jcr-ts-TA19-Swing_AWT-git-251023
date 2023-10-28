
public class Calculadora {

	private static Double op1;
	private static Double op2;

	public Calculadora() {
		this.op1 = 0.0;
		this.op2 = 0.0;
	}

	public static void setOp1(Double op1) {
		Calculadora.op1 = op1;
	}

	public static void setOp2(Double op2) {
		Calculadora.op2 = op2;
	}

	
	public static double add() {

		return op1 + op2;
	}

	public static double substract() {

		return op1 - op2;
	}

	public static double multiply() {

		return op1 * op2;
	}

	public static double divide() throws Exception {

		return op1 / op2;
	}	
}
