import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
		System.out.println(System.getProperty("log4j2.configurationFile"));
		logger.error("ceci est un message error");
		try {
			Porte porte = new Porte(1, 1, 1, true);
			porte.verrouiller();
			
		} catch (IllegalBlocException e) {
			System.out.println("Impossible de construire le bloc.");
		} catch (PorteVerrouilleException exception) {
			System.out.println("La porte est déjà vérrouillée.");
			logger.info("ceci est un message info");
		}
	}
    
}