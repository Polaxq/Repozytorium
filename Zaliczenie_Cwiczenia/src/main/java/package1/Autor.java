/**
 * Klasa bazowa abstract
 * Dziedzicza po niej inne klasy
 * Zaiwera konstruktor oraz zmienna String ocena
 * Zawiera metode Opinia()
 */
package package1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public abstract class Autor {
    protected String ocena;
    private static final Logger logger = LogManager.getLogger(Autor.class);
    public Autor(String ocena) {
        this.ocena = ocena;
    }
    public void info(){
        logger.info("Warto czytac ksiazki!");
        System.out.println("Hej");
    }

    public abstract void Opinia();
}
