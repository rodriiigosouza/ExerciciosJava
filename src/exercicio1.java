import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	int v1, v2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("digite o primeiro valor: ");
	v1 = sc.nextInt();
	System.out.println("digite o segundo valor: ");
	v2 = sc.nextInt();
	
	System.out.printf("a soma entre %d e %d é %d", v1, v2, v1+v2);
			
	sc.close();
	}

}
