package exLacoCondicionalSwitch;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		
		float n1,n2, result;
		int codigoOperacao;
		
		System.out.println("\nCódigo	Operação");
		System.out.println("\n1	Soma");
		System.out.println("\n2	Subtração");
		System.out.println("\n3	Multiplicação");
		System.out.println("\n4	Divisão");
		
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nDigite o código da operação: ");
		codigoOperacao = ler.nextInt();
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = ler.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		n2 = ler.nextFloat();
		
		switch(codigoOperacao) {
		
		case 1:
			result = n1 + n2;
			System.out.println("\n" + n1 + " + " + n2 + " = " + result );
			break;
			
		case 2:
			result = n1 - n2;
			System.out.println("\n" + n1 + " - " + n2 + " = " + result );
			break;
			
		case 3:
			result = n1 * n2;
			System.out.println("\n" + n1 + " x " + n2 + " = " + result );
			break;
			
		case 4:
			result = n1 / n2;
			System.out.println("\n" + n1 + " / " + n2 + " = " + result );
			break;
			
		default:
			System.out.println("\nEscolha uma das opções sugeridas.");
	}
		
	}

}
