package tarea3;

public class ejercicio4 {
   public static void main(String[] args) {
    double x;
    double y;
    String lin;

    System.out.print("Introduzca el primer número: ");
    lin = System.console().readLine();
    x = Double.parseDouble(lin);
    System.out.print("Introduzca el segundo número: ");
    lin = System.console().readLine();
    y = Double.parseDouble(lin);
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x * y = " + (x * y));
  } 
}
