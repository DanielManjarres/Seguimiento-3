package ejercicio8seg3;
public class Concierto {
    public int maxEntriesGeneral;
    public int maxEntriesVIP;
    public int entriesSoldGeneral;
    public int entriesSoldVIP;

    public Concierto(int maxEntriesGeneral, int maxEntriesVIP, int entriesSoldGeneral, int entriesSoldVIP) {
        this.maxEntriesGeneral = maxEntriesGeneral;
        this.maxEntriesVIP = maxEntriesVIP;
        this.entriesSoldGeneral = entriesSoldGeneral;
        this.entriesSoldVIP = entriesSoldVIP;
    }

    public void checkAvailability() {
        System.out.println("Entradas disponibles - Zona General: " + (maxEntriesGeneral-entriesSoldGeneral));
        System.out.println("Entradas disponibles - Zona VIP: " + (maxEntriesVIP-entriesSoldVIP));
    }

    public void sellEntry(String zone, int value) {
        if (zone.equals("GENERAL") && this.entriesSoldGeneral < this.maxEntriesGeneral) {
            System.out.println("Entrada vendida en zona General");
        } else if (zone.equals("VIP") && this.entriesSoldVIP < this.maxEntriesVIP) {
            System.out.println("Entrada vendida en zona VIP");
        } else {
            System.out.println("No hay entradas disponibles en la zona solicitada");
        }

    }
}