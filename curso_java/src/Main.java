import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int hour;

        System.out.println("Que horas são? ");
        hour = sc.nextInt();

        if (hour < 12) {
            System.out.println("Bom dia, calabreso!");
        } else if (hour < 18) {
            System.out.println("Boa tarde, caramelo!");
        } else {
            System.out.println("Boa noite, cinderela!");
        };

        sc.close();
		
	}

}
