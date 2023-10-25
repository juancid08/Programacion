package tarea3;

public class ejercicio5 {
     public static void main(String[] args) {
    System.out.println("Área de un rectángulo");
    System.out.println("----------------------");
    System.out.print(" introduzca la longitud de la base (cm): ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la altura (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.println("El área de un rectángulo es " + (b * h) + " cm²");
  }
    
}
