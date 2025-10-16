package ejercicios2_1Printf;
import static ejercicios2_1Printf.Colors.*;
public class Ejercicio2 {
	public void excercise2() {
		System.out.printf("%s%s%s %s%s%s %s%s%s", CYAN, RED_BACKGROUND, "Primero", YELLOW, PURPLE_BACKGROUND, "Segundo", PURPLE, BLUE_BACKGROUND, "Tercero");
	}
	public static void main(String[] args) {
		new Ejercicio2().excercise2();
	}
}