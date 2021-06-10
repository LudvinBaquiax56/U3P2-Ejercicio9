import java.util.*;

public class Ejercicio9 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int temperatura1;
		int temperatura2;
		
		int totaltemperatura = 0;
		int numerototal = 0;
		double promediotemperaturas;
		
		do {
			System.out.println("Ingrese la temperatura 1");
			temperatura1 = scanner.nextInt();
			System.out.println("Ingrese la temperatura 2");
			temperatura2 = scanner.nextInt();
			if (temperatura1>=5 && temperatura1<=15) {
				totaltemperatura = totaltemperatura+temperatura1;
				numerototal = numerototal+1;
			}
			if (temperatura2>=5 && temperatura2<=15) {
				totaltemperatura = totaltemperatura+temperatura2;
				numerototal = numerototal+1;
			}
		} while (temperatura1!=0);
		promediotemperaturas = totaltemperatura/numerototal;
		System.out.println("El promedio de "+numerototal+" temperaturas que se encuentran en el rango de 5 y 15 grados es "+promediotemperaturas);
	}

}

