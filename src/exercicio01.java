import java.util.Locale;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "computer";
		String product2 = "office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("products:");
		System.out.printf("%s, which price is $ %f%n", product1, price1);
		System.out.printf("%s, which price is $ %f%n%n", product2, price2);
		System.out.printf("record: %d yearsd old, code %d and gender: %C%n%n", age, code, gender);
		System.out.printf("measue with eigth decimal places: %.8f%n", measure);
		System.out.printf("rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
