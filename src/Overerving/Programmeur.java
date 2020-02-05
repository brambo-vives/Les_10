package Overerving;

public class Programmeur extends Werknemer {
    private  String programmertaal;

    public Programmeur(String naam, int leeftijd, double salaris, String programmertaal) {
        super(naam, leeftijd, salaris);
        this.programmertaal = programmertaal;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\ntaal : " + programmertaal;
    }

    public String programmeer() {
        return "Ik schrijf code in " + programmertaal;
    }
}