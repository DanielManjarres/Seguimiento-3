package ejercicio8seg3;

public class Entrada {
    public int entryNumber;
    public String zone;
    public int value;
    public boolean sold;
    public boolean deposit;

    public Entrada(int entryNumber, String zone, int value){
        this.entryNumber = entryNumber;
        this.zone = zone;
        this.value = value;
        this.sold = false;
        this.deposit = false;
    }
    public void entrySold(){
        if (sold==false){
           sold = true;
            System.out.println("Entrada vendida " + entryNumber);
        }else {
            System.out.println("Entrada ya vendida");
        }
    }
    public void markEnter() {
        if (sold && deposit==false) {
            deposit = true;
            System.out.println("Entrada ingresada: " + entryNumber);
        } else if (!sold) {
            System.out.println("La entrada no ha sido vendida");
        } else {
            System.out.println("La entrada ya ha sido ingresada");
        }
    }

}
