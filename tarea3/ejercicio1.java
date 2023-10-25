package tarea3;

public class ejercicio1 {
    public static void main(String[] args) {
    int x;
    int y;
    String lin;

    System.out.println("Este programa multiplica dos números enteros.");
    System.out.print("Por favor, introduzca el primer número: ");
    lin = System.console().readLine();
    x = Integer.parseInt(lin);
    System.out.print("Introduzca el segundo número: ");
    lin = System.console().readLine();
    y = Integer.parseInt(lin);

    System.out.println(x + " * " + y + " = " + (x * y));
  }
    
}
