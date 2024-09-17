package application;
import java.util.Scanner;
import entities.ContaBancaria;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// recebendo os dados do usuario
		System.out.println("Enter account numer: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine(); // para o nextLine não consumir essa linha
		String titular = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		ContaBancaria conta1 = new ContaBancaria(number, titular); // Instanciando um objeto ContaBancaria
		
		double value;
		
		// verifica se o usuario deseja realizar um deposito inicial
		if(option == 'y') {
			System.out.println("Enter initial deposit value: ");
			value = sc.nextDouble();
			System.out.println("Account created with deposit");
		}
		else {
			System.out.println("Account created");
			value = 0;
		}
		
		conta1.deposit(value); // chama a função "Deposit"
		System.out.println(conta1); // printa o objeto "conta1"
		
		System.out.println("Enter a deposit value: ");
		value = sc.nextDouble();
		conta1.deposit(value); // chama a função "Deposit"
		System.out.println("Updated account data: ");
		System.out.println(conta1); // printa o objeto "conta1"
		
		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		conta1.withDraw(value); // chama a função "WithDraw"
		System.out.println("Updated account data: ");
		System.out.println(conta1); // printa o objeto "conta1"
		
		
		   sc.close();
		}
}
