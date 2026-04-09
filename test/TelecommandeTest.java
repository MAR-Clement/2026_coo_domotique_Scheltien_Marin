import org.junit.Test;
import static org.junit.Assert.*;

public class TelecommandeTest {

    @Test
    public void testAjoutLampeVide() {
        // préparation
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");

        // action
        t.ajouterLampe(l);

        // vérification
        assertTrue(t.toString().contains("Salon"));
    }

    @Test
    public void testAjoutLampeAvecUneLampe() {
        Telecommande t = new Telecommande();
        t.ajouterLampe(new Lampe("Salon"));

        Lampe l2 = new Lampe("Cuisine");

        t.ajouterLampe(l2);

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
    (expected = Error.class)
    public void testactiverAppareilInexistante() {
        Telecommande t = new Telecommande();

        t.activerAppareil(0);
    }
}
