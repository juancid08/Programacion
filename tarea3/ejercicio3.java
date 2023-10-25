package tarea3;

public class ejercicio3 {
    public static void main(String[] args) {
    System.out.print("Por favor, introduzca la cantidad de pesetas que quiere convertir: ");
    int pes = Integer.parseInt(System.console().readLine());

    double eur = pes / 166.386;

    System.out.printf("%d pesetas son %.2f euros.", pes, eur);
  }
}
