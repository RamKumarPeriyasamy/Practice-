import java.util.logging.Logger;

public class project {
    private static final Logger log = Logger.getLogger(project.class.getName());

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            log.info("i = " + i);
            i++;
        }
    }
}
