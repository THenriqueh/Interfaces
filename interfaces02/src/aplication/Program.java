package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import servives.ContractService;
import servives.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue);
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();

		ContractService cs = new ContractService(new PaypalService());

		cs.porcessContract(contract, n);
		
		System.out.println("Installments: ");
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}

		sc.close();

	}

}
