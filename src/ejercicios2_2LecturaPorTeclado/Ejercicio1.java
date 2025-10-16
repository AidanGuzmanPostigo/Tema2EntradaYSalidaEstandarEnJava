package ejercicios2_2LecturaPorTeclado;
import java.util.Scanner;
public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void excercise1() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce el nombre");
		String s1 = keyboard.nextLine();
		System.out.println("Introduce los apellidos");
		String s2 = keyboard.nextLine();
		System.out.println("Introduce la edad");
		byte d1 = keyboard.nextByte();
		keyboard.nextLine();
		System.out.println("Introduce la calle");
		String s3 = keyboard.nextLine();
		System.out.println("Introduce el número");
		int d2 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Introduce el código postal");
		int d3 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Introduce la provincia");
		String s4 = keyboard.nextLine();
		System.out.println("Introduce true si es estudiante o false si no");
		boolean b1 = keyboard.nextBoolean();
		keyboard.nextLine();
		System.out.println("Introduce la altura usando decimales");
		double f1 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.printf("1. %s \n2. %s \n3. %d \n4. Dirección: \n%s \n%s \n%s \n%s \n5. %b \n6. %.2f", s1, s2, d1, "      ∘ " + s3, "      ∘ " + d2, "      ∘ " + d3, "      ∘ " + s4, b1, f1);
	}
	public static void main(String[] args) {
		new Ejercicio1().excercise1();
	}
}