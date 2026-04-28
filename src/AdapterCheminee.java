public class AdapterCheminee implements Appareil {

    private Cheminee cheminee;

    public AdapterCheminee (Cheminee c) {
        this.cheminee = c;
    }

    @Override
    public void allumer() {
        int intensite = cheminee.getLumiere();
        cheminee.changerIntensite(intensite + 10);
    }

    @Override
    public void eteindre() {
        cheminee.changerIntensite(0);
    }
}