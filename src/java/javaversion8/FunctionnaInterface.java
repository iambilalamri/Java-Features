package java.javaversion8;

@FunctionalInterface
public interface FunctionnaInterface {

	/**
	 * �interface fonctionnelle� qui permet de d�finir une interface disposant d�une
	 * unique m�thode abstraite, c�est-�-dire une seule m�thode ne poss�dant pas
	 * d�impl�mentation par d�faut.
	 */
	void function1();

	/**
	 * Toute fonction declar�e doit etre implement�e sauf la fonction abstraite (ex.
	 * fonction()).
	 */
	default double addOperand(double operand1, double operand2) {
		return operand1 + operand2;
	}

	default void modulo(double operand1, double operand2) {
		System.out.println(operand1 % operand2);
	}
	
	static void print(String str){
		System.out.println("Printing "+str);
	}
}
