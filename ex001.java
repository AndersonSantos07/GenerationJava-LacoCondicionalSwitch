package exLacoCondicionalSwitch;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		int preco,valorTotal,quantidade,codigo;
		String produto;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\t\tTabela dos produtos: ");
		System.out.println("\n1 - Cachorro Quente  R$ 10.00");
		System.out.println("\n2 - X-Salada         R$ 15.00");
		System.out.println("\n3 - X-Bacon          R$ 18.00");
		System.out.println("\n4 - Baru             R$ 12.00");
		System.out.println("\n5 - Refrigerante     R$ 8.00");
		System.out.println("\n3 - X-Bacon          R$18.00");
		
		System.out.println("\nDigite o código do produto: ");
		codigo = ler.nextInt();
		
		System.out.println("\nDigite a quantidade do produto: ");
		quantidade = ler.nextInt();
		
		switch(codigo) {
			
		case 1:
			produto = "Cachorro Quente";
			preco = 10;
			valorTotal = preco * quantidade;
			System.out.println("\n Produto: " + produto);
			System.out.println("\n Valor Total: " + " R$" + valorTotal + ".00");
			break;
			
		case 2:
			produto = "X-Salada";
			preco = 15;
			valorTotal = preco * quantidade;
			System.out.println("\n Produto: " + produto);
			System.out.println("\n Valor Total: " + " R$" + valorTotal + ".00");
			break;
			
		case 3:
			produto = "X-Bacon";
			preco = 18;
			valorTotal = preco * quantidade;
			System.out.println("\n Produto: " + produto);
			System.out.println("\n Valor Total: " + " R$" + valorTotal + ".00");
			break;
			
		case 4:
			produto = "Bauru";
			preco = 12;
			valorTotal = preco * quantidade;
			System.out.println("\n Produto: " + produto);
			System.out.println("\n Valor Total: " + " R$" + valorTotal + ".00");
			break;
			
		case 5:
			produto = "Refrigerante";
			preco = 8;
			valorTotal = preco * quantidade;
			System.out.println("\n Produto: " + produto);
			System.out.println("\n Valor Total: " + " R$" + valorTotal + ".00");
			break;
			
		case 6:
			produto = "Suco de laranja";
			preco = 13;
			valorTotal = preco * quantidade;
			System.out.println("\n Produto: " + produto);
			System.out.println("\n Valor Total: " + " R$" + valorTotal + ".00");
			break;
			
		default:
			System.out.println("\nEscolha um dos códigos!");
			
			
		}

	}

}
