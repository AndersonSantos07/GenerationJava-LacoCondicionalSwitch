package exLacoCondicionalSwitch;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		float saldo = 1000f,saque,deposito;
		int operacao;
		
		System.out.println("\nCódigo da Operação\tOperação");
		System.out.println("\n1\tSaldo");
		System.out.println("\n2\tSaque");
		System.out.println("\n3\tDepósito");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite a operação desejada: ");
		operacao = ler.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("\nOperação - Saldo");
			if(saldo == 0) {
				System.out.println("\nSaldo insuficiente! ");
			}else {
				System.out.println("\nSaldo: " + saldo);
			}
			break;
			
		case 2:
			System.out.println("\nOperação - Saque");
			System.out.println("\nDigite o valor do saque desejado: ");
			saque = ler.nextFloat();
			if(saldo == 0) {
				System.out.println("\nSaldo insuficiente! ");
			}else if(saque > saldo){
				System.out.println("\nSaldo insuficiente! ");
				System.out.println("\nSaldo: " + saldo);
			}else {
				saldo -= saque;
				System.out.println("\nOperação - Saque");
				System.out.println("\nSaldo: " + saldo);
			}
			break;
			
		case 3:
			System.out.println("\nDigite o valor do Depósito: ");
			deposito = ler.nextFloat();
			saldo+=deposito;
			break;
			
		default:
			System.out.println("\nDigite um dos códigos disponíveis! ");
			break;
		}
		
		
		
	}

}
