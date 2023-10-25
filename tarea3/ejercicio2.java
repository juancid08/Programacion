package tarea3;

public class ejercicio2 {
    public static void main(String[] args) {
    System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
    double eur = Double.parseDouble(System.console().readLine());

    int pes = (int) (eur * 166.386);
    
    System.out.printf("%.2f euros son %d pesetas.", eur, pes);
  }

    
}
