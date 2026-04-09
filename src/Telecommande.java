import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;

    public Telecommande() {
        appareils = new ArrayList<>();
    }

    public void ajouterAppareil(Appareil a) {
        appareils.add(a);
    }

    public void activerAppareil(int i) {
        if (i < 0 || i >= appareils.size()) {
            throw new Error("Indice invalide");
        }
        appareils.get(i).allumer();
    }

    public void desactiverAppareil(int i) {
        if (i < 0 || i >= appareils.size()) {
            throw new Error("Indice invalide");
        }
        appareils.get(i).eteindre();
    }
}