package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department's name:");
		String depNome= sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name:");
		String nomeTrabalhador = sc.nextLine();
		System.out.println("Level:");
		String nivelTrabalhador = sc.nextLine();
		System.out.println("Base salary: ");
		double salarioBasico = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBasico, new Departamento(depNome));
		
		System.out.println("How many contracts to this worker?");
		int n = sc.nextInt();
		
		for (int i=0; i<n;i++) {
		System.out.printf("Enter contract #%d data:", i+1);
		sc.nextLine();
		System.out.println("Date (DD/MM/YYYY):");
		String data =sc.nextLine();
		LocalDate datacontrato = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Value per hour: ");
		double valorHora = sc.nextDouble();
		System.out.println("Duration (hours): ");
		int numeroHoras = sc.nextInt();
		HoraContrato contrato = new HoraContrato(datacontrato, valorHora, numeroHoras);
		trabalhador.adicionarContrato(contrato);
		}
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String meseano = sc.next();
		int mes= Integer.parseInt(meseano.substring(0,1));
		int ano= Integer.parseInt(meseano.substring(3,6));
		System.out.println("Name:");
		System.out.println(trabalhador.getNome());
		System.out.println("Department");
		System.out.println(trabalhador.getDepartamento().getNome());
		System.out.println("Income for "+ meseano);
		System.out.printf("%.2f", trabalhador.renda(ano, mes));
		
		
		
		
		
		
	}

}
