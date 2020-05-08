import java.util.Locale;
import java.util.Scanner;

public class ProblemaBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int cervejas, refri, espetos;
		double ingresso, couvert, consumo, total;
		
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerante: ");
		refri = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		espetos = sc.nextInt();
		
		if (sexo == 'F') {
			ingresso = 8.0;
		}
		else {
			ingresso = 10.0;
		}
		
		consumo = cervejas * 5.0 + refri * 3.0 + espetos * 7.0;
		
		if (consumo > 30) {
			couvert = 0.0;
		}
		else {
			couvert = 4.0;
		}
		
		total = ingresso + consumo + couvert;
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if (couvert == 0.0) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", couvert);
		}
		System.out.printf("Ingresso = R$ %.2f%n", ingresso);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		sc.close();
	}

}
