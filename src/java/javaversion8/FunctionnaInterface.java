package java.javaversion8;

@FunctionalInterface
public interface FunctionnaInterface {

	/**
	 * ”interface fonctionnelle” qui permet de définir une interface disposant d’une
	 * unique méthode abstraite, c’est-à-dire une seule méthode ne possédant pas
	 * d’implémentation par défaut.
	 */
	void function1();

	/**
	 * Toute fonction declarée doit etre implementée sauf la fonction abstraite (ex.
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
