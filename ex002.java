package exLacoCondicionalSwitch;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		String nome;
		int cargo;
		float salario,novoSalario;
		
		System.out.println("\n\t\tTabela cargos: ");
		System.out.println("\nCódigo | Cargo | Percentual do Reajuste");
		System.out.println("\n1 -     Gerente          10%");
		System.out.println("\n2 -     Vendedor         7%");
		System.out.println("\n3 -     Surpervisor      9%");
		System.out.println("\n4 -     Motorista        6%");
		System.out.println("\n5 -     Estoquista       5%");
		System.out.println("\n3 -     Técnico de TI    8%");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		nome = ler.next();
		
		System.out.println("\nDigite seu Código de Cargo: ");
		cargo = ler.nextInt();
		
		System.out.println("\nDigite seu salário: ");
		salario = ler.nextFloat();
		
		switch(cargo) {
		
		case 1:
			novoSalario = salario + (salario * 0.1f);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo do colaborador: " + cargo);
			System.out.println("\nSalário: " + novoSalario);
			break;
			
		case 2:
			novoSalario = salario + (salario * 0.07f);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo do colaborador: " + cargo);
			System.out.println("\nSalário: " + novoSalario);
			break;
			
		case 3:
			novoSalario = salario + (salario * 0.09f);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo do colaborador: " + cargo);
			System.out.println("\nSalário: " + novoSalario);
			break;
			
		case 4:
			novoSalario = salario + (salario * 0.06f);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo do colaborador: " + cargo);
			System.out.println("\nSalário: " + novoSalario);
			break;
			
		case 5:
			novoSalario = salario + (salario * 0.05f);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo do colaborador: " + cargo);
			System.out.println("\nSalário: " + novoSalario);
			break;
			
		case 6:
			novoSalario = salario + (salario * 0.08f);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo do colaborador: " + cargo);
			System.out.println("\nSalário: " + novoSalario);
			break;
			
		default:
			System.out.println("\nEscolha os códigos disponíveis!");
			
			
				
		
		}
		
		
		
		
		
		
		
		
		
		

	}

}
