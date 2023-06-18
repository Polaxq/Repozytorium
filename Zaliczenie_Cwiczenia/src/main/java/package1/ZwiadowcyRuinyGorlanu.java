/**
 * Klasa dziedziczaca po Autorze
 * Pobiera ocena oraz funkcje Opinia()
 */
package package1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ZwiadowcyRuinyGorlanu extends Autor {
    public ZwiadowcyRuinyGorlanu(String ocena) {
        super(ocena);
    }
    //private static final Logger logger = LogManager.getLogger(ZwiadowcyRuinyGorlanu.class);
    public void Opinia() {
        System.out.println("Twoja opinia: " + ocena);
    }

    @Override
    public void info() {
        super.info();
    }
    //public void info(){
        //logger.info("Warto czytac ksiazki!");
    //};
}
