package tarea3;

public class ejercicio6 {
     public static void main(String[] args) {
    System.out.println("Área de un triángulo");
    System.out.println("--------------------");
    System.out.print("Introduzca la longitud de la base (cm): ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Inroduzca la altura (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.println("El área del triángulo es " + (b * h)/2 + " cm²");
  }
    
}
