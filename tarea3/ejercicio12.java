package tarea3;

public class ejercicio12 {
    public static void main(String[] args) {
        System.out.print("Introduzca la nota del primer examen: ");
        double not1 = Double.parseDouble(System.console().readLine());
    
        System.out.print("¿Qué nota quiere sacar en el trimestre? ");
        double notFin = Double.parseDouble(System.console().readLine());
        double not2 = ((notFin * 100) - (not1 * 40)) / 60;
    
    System.out.println("Para tener un " + notFin + " en el trimestre");
    System.out.println(" necesita sacar un " + not2 + " en el segundo examen.");
    
}
}