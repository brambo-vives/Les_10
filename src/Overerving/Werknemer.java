package Overerving;

public class Werknemer {
    private String naam;
    private int leeftijd;
    private double salaris;

    public Werknemer(String naam, int leeftijd, double salaris) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.salaris = salaris;
    }

    public String printInfo() {
        return "Naam: " + naam + "\n" +
                "Leeftijd: " + leeftijd + "\n" +
                "Salaris: " + salaris;
    }
}
