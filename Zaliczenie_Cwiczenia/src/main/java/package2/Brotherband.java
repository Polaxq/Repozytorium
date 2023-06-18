/**
 * Klasa dziedziczaca po Autorze
 * Pobiera ocena oraz funkcje Opinia()
 */
package package2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import package1.Autor;

public class Brotherband extends Autor {
    public Brotherband(String ocena) {
        super(ocena);
    }
    private static final Logger logger = LogManager.getLogger(Brotherband.class);
    public void Opinia() {
        System.out.println("Twoja opinia: " + ocena);
    }

    @Override
    public void info() {
        super.info();
    }
}
