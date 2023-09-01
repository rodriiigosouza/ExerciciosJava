import java.util.Scanner;

public class teste_de_entrada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		
		System.out.println("digite uma palavra:");
		x =  sc.next();
		System.out.println("vc digitou: " + x);
		
		System.out.println("");
		
		System.out.println("digite uma numero:");
		y =  sc.nextInt();
		System.out.println("vc digitou: " + y);
		

		sc.close();
	}

}
