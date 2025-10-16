package ejercicios2_1Printf;
public class Ejercicio1 {
	public void excercise1() {
		int x=10, y=-10;
		float n = 13.269834f;
		String cad="Ana";
		System.out.printf("%1$d\n%1$+d\n%2$+d\n%3$.2f\n%3$+10.4f\n%3$10.5f\n%3$+010.3f\nn=%3$-8.2fx=%1$d\n%4$9s%4$s%4$5s", x, y, n, cad);
	}
	public static void main(String[] args) {
		new Ejercicio1().excercise1();
	}
}