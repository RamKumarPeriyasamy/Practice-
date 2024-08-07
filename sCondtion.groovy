import java.util.logging.Logger;

public class sCondtion {
    private static final Logger log = Logger.getLogger(sCondtion.class.getName());

    public static void main(String[] args) {
        String grade = "C";

        switch (grade) {
            case "A":
                log.info("Excellent");
                break;

            case "B":
                log.info("Good");
                break;

            case "C":
                log.info("Average");
                break;

            default:
                log.info("Grade not recognized");
        }
    }
}
