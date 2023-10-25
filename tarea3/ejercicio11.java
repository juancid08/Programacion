package tarea3;

public class ejercicio11 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número de Kb: ");
        double kb = Double.parseDouble(System.console().readLine());
        System.out.println(kb + "Kb son " +  (kb / 1024) + "Mb");
      }   
}
