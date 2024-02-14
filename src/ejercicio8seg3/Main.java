package ejercicio8seg3;


public class Main {
    public static void main(String[] args) {
        Concierto concierto = new Concierto(100,30,12,5);
        System.out.println("---------------------------");
        concierto.sellEntry("GENERAL",50000);
        concierto.sellEntry("VIP",80000);
        System.out.println("---------------------------");
        Entrada entrada1 = new Entrada(12,"GENERAL",50000);
        Entrada entrada2 = new Entrada(5,"VIP",80000);
        entrada1.entrySold();
        entrada1.markEnter();
        System.out.println("---------------------------");
        entrada2.entrySold();
        entrada2.markEnter();
        System.out.println("---------------------------");
        concierto.checkAvailability();
    }
}
