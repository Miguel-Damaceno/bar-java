import java.util.Locale;
import java.util.Scanner;

public class ProblemaBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int cervejas, refri, espetos;
		
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerante: ");
		refri = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		espetos = sc.nextInt();
		
		sc.close();
	}

}
