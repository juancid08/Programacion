package tarea3;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabaj = Integer.parseInt(System.console().readLine());
        System.out.println("Su salario semanal es de " + (horasTrabaj * 12) + " euros.");
      }
    
}
