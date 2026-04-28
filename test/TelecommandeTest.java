import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelecommandeTest {

    @Test
    public void testAjoutLampeVide() {
        // préparation
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");

        // action
        t.ajouterAppareil(l);

        // vérification
        assertTrue(t.toString().contains("Salon"));
    }

    @Test
    public void testAjoutLampeAvecUneLampe() {
        Telecommande t = new Telecommande();
        t.ajouterAppareil(new Lampe("Salon"));

        Lampe l2 = new Lampe("Cuisine");

        t.ajouterAppareil(l2);

        assertTrue(t.toString().contains("Cuisine"));
    }

    @Test
    public void testActiverLampePosition0() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");
        t.ajouterAppareil(l);

        t.activerAppareil(0);

        assertTrue(l.toString().contains("true"));
    }

    @Test
    public void testactiverAppareilPosition1() {
        Telecommande t = new Telecommande();
        t.ajouterAppareil(new Lampe("Salon"));
        Lampe l2 = new Lampe("Cuisine");
        t.ajouterAppareil(l2);

        t.activerAppareil(1);

        assertTrue(l2.toString().contains("true"));
    }

    @Test
    public void testactiverAppareilInexistante() {
        Telecommande t = new Telecommande();

        t.activerAppareil(0);
    }
    @Test
    public void testActiverCheminee() {
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        Appareil adapter = new AdapterCheminee(c);

        t.ajouterAppareil(adapter);

        t.activerAppareil(0);

        assertEquals(10, c.getLumiere());
    }
    @Test
    public void testDesactiverCheminee() {
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        Appareil adapter = new AdapterCheminee(c);

        t.ajouterAppareil(adapter);

        t.activerAppareil(0); // on allume d'abord
        t.desactiverAppareil(0);

        assertEquals(0, c.getLumiere());
    }
}
