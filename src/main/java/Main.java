import java.util.Arrays;

import javax.xml.crypto.Data;

import de.milchreis.uibooster.UiBooster;
import de.milchreis.uibooster.model.Form;
import de.sbs.fswi1.services.DataAccessObject;

public class Main {


    private static DataAccessObject dao = new DataAccessObject("/Users/student/Documents/Data/studenten.csv");

    public static void main(String[] args) {
        
        new UiBooster().showConfirmDialog(
                "Möchtest du einen neuen Studenten anlegen?",
                "Bist du sicher?",
                () -> System.out.println("Action accepted"),
                () -> System.out.println("Action declined"));

        UiBooster booster = new UiBooster();
        Form form = booster.createForm("Neuer Student")
            .addText("Vorname:")
            .addText("Nachname:")
            .addDatePicker("Geburtstag:")
            .addSelection("In welcher Klasse sind Sie?",Arrays.asList("FSWI-1", "FSWI-2"))
            .show();
        
    
    }
}
