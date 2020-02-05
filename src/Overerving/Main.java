package Overerving;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Werknemer jan = new Werknemer("Jan", 30, 4000);
        System.out.println(jan.printInfo());
        if (jan instanceof Programmeur) {
            System.out.println("Werknemer jan is wel degelijk een Programmeur");
        } else {
            System.out.println("Werknemer jan is GEEN Programmeur");
        }

        System.out.println();
        Programmeur pol = new Programmeur("Pol", 28, 5000, "Java");
        System.out.println(pol.printInfo());
        pol.programmeer();

        System.out.println();
        Werknemer piet = new Programmeur("Piet", 26, 3000, "visual basic");
        //FOUT : De compiler kijkt naar het referentietype : Werknemer => heeft geen methode programmeer.
        //piet.programmeer();

        //FOUT : niet elke Werknemer is een Programmeur
        //Programmeur geert = new Werknemer("Geert", 30, 3000);

        //!!! At RUN-time kijken we naar het Object type we gebruiken de methode printinfo() van Programmeur
        System.out.println(piet.printInfo());

        Programmeur pietAlsProgrammeur = (Programmeur) piet;
        pietAlsProgrammeur.programmeer();
        if (piet instanceof Programmeur) {
            System.out.println("Werknemer piet is wel degelijk een Programmeur");
        }
        if (piet instanceof Werknemer) {
            System.out.println("Werknemer piet is dus ook een Werknemer");
        }

    }
}