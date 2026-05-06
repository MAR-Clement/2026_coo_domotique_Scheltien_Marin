import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChargeurMagasinTest {

    @Test
    void testChargementValide() {
        ChargeurMagasin chargeur = new ChargeurMagasin("donnees/xml");
        
        Magasin magasin = chargeur.chargerMagasin();
        
        assertNotNull(magasin);
        assertTrue(magasin.getListeCD().size() > 0);
    }

    @Test
    void testChargementInvalide() {
        ChargeurMagasin chargeur = new ChargeurMagasin("repertoire_inexistant");
        
        assertThrows(RuntimeException.class, () -> {
            chargeur.chargerMagasin();
        });
    }
}