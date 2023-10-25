package tarea3;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.print("Introduzca la base imponible (precio del artículo sin IVA): ");
        double basImp = Double.parseDouble(System.console().readLine());
    
        System.out.printf("Base imponible %8.2f €", basImp);
        System.out.printf("IVA (21%%)      %8.2f €", (basImp * 0.21));
        System.out.printf("-------------------------");
        System.out.printf("Total          %8.2f €", (basImp * 1.21));
      }
    
}
