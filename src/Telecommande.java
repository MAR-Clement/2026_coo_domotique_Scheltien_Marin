import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande() {
        lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new Error("Indice invalide");
        }
        lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new Error("Indice invalide");
        }
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe l : lampes) {
            l.allumer();
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < lampes.size(); i++) {
            result += i + " : " + lampes.get(i) + "\n";
        }
        return result;
    }
}