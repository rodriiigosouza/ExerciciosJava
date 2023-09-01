import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double pi=3.14159, raio;
	
	
	System.out.println("informe o tamanho do raio: ");
	raio = sc.nextDouble();
	System.out.printf("A area do circulo é %f", Math.pow(raio, 2.0)*pi);
	
	sc.close();

	}

}
