import java.util.UUID;

public class Person extends Datensatz{

    private String vorname, nachname;



    public Person(String vorname, String nachname) {
        super();
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        String ausgabe = "Name:" + this.vorname + " " + this.nachname + " uuid: " + getId();
        return ausgabe;
    }
}
