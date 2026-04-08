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
        t.ajouterLampe(l);

        t.activerLampe(0);

        assertTrue(l.toString().contains("true"));
    }

    @Test
    public void testActiverLampePosition1() {
        Telecommande t = new Telecommande();
        t.ajouterLampe(new Lampe("Salon"));
        Lampe l2 = new Lampe("Cuisine");
        t.ajouterLampe(l2);

        t.activerLampe(1);

        assertTrue(l2.toString().contains("true"));
    }

    @Test
            (expected = Error.class)
    public void testActiverLampeInexistante() {
        Telecommande t = new Telecommande();

        t.activerLampe(0);
    }
}