
import java.util.logging.Logger;

public class forloop {
      private static final Logger log = Logger.getLogger(forloop.class.getName())

     static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            log.info("i = " + i);
        }
    }
}