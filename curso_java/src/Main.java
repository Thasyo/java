import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Ex. 01
		int validPassword = 2002;
		int inputPassword = sc.nextInt();
		
		while(inputPassword != validPassword) {
			System.out.println("Senha inválida!");
			inputPassword = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido.");
		*/
		
		/*Ex 02
		int X, Y;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while(X != 0 || Y != 0) {
			
			if(X > 0 && Y > 0) {
				System.out.println("1° Quadrante");
			}else if(X < 0 && Y > 0) {
				System.out.println("2° Quadrante");
			}else if(X < 0 && Y < 0) {
				System.out.println("3° Quadrante");
			}else if(X > 0 && Y < 0) {
				System.out.println("4° Quadrante");
			}
			
			X = sc.nextInt();
			Y = sc.nextInt();
			
		}
		
		sc.close();
		*/
		
		//Ex 03
		int alcool = 0;
		int gasosa = 0; 
		int diesel = 0;
		int input;
		
		input = sc.nextInt();
		
		while(input != 4){
			switch(input) {
				case 1:
					alcool += 1;
					break;
				case 2:
					gasosa += 1;
					break;
				case 3:
					diesel += 1;
					break;
				default:
					break;
			}
			
			input = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasosa);
		System.out.println("Diesel: " + diesel);
	}
	

}
