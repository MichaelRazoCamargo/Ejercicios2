import java.util.Scanner;

public class CalculadoraDeComiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe la venta que realizaste:");
		int rango = in.nextInt();
		float comision=7F;
		
		if (rango >= 10000) {
			comision *= 0.30F;
		}else if (rango>= 5001-9999) {
			comision *=0.20F;
		}else if (rango>= 1001-4999) {
			comision *=0.10F;
		}else if (rango<= 1000) {
			comision *=0.00F;
		}
		System.out.println("la comisiones: $" + comision);
		in.close();	
	}

}
