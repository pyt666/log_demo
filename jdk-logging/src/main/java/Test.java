import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @ClassName Test
 * @Description TODO
 * @Author pyt
 * @Date 2019/7/31 13:46
 * @Version
 */
public class Test {
    public static Logger log = Logger.getLogger(Test.class.toString());

    static {
        Handler console = new ConsoleHandler();
        console.setLevel(Level.ALL);
        log.addHandler(console);
    }

    public static void main(String[] args) {
        //all→finest→finer→fine→config→info→warning→server→off
        log.setLevel(Level.ALL);
        log.finest("finest");
        log.finer("finer");
        log.fine("fine");
        log.config("config");
        log.info("info");
        log.warning("warning");
    }
}
