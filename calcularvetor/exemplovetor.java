package calcularvetor;

public class exemplovetor {

	public static void main(String[] args) {
		
		int[] valores = {230, 30, 56, 123, 980, 12, -98};
		String[] operadores = {"/", "+", "*", "/", "-", "*"};

		double resultado = valores[0];

		for (int i = 0; i < operadores.length; i++) {
		    switch (operadores[i]) {
		        case "/":
		            resultado /= valores[i + 1];
		            break;
		        case "+":
		            resultado += valores[i + 1];
		            break;
		        case "*":
		            resultado *= valores[i + 1];
		            break;
		        case "-":
		            resultado -= valores[i + 1];
		            break;
		    }
		}

		System.out.println(resultado);

		 


	}

}
