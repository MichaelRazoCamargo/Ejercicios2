import java.util.Scanner;
public class DescuentoEnPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa tu edad");
		int age = in.nextInt();
		float ticket=7F;
		
		if (age >= 60) {
			ticket*= 0.55F;
		}else if (age<= 5) {
			ticket*=0.60F;
		}
		System.out.println("El precio es: $" + ticket);
	in.close();
	}

}
