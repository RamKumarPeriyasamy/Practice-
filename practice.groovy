
import java.util.logging.Logger;

public class EnvLogger {
    private static final Logger log = Logger.getLogger(EnvLogger.class.getName());

    public static void main(String[] args) {
        String Env = "SIT";
        String URL = "";

        if ("SIT".equals(Env)) {
            URL = "SIT URL";
            log.info(URL);
        } else if ("UAT".equals(Env)) {
            URL = "UAT URL";
            log.info(URL);
        } else if ("PRE PROD".equals(Env)) {
            URL = "PRE PROD URL";
            log.info(URL);
        } else {
            URL = "UAT Not Available";
            log.info(URL);
        }
    }
}
