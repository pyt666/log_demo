import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName Test
 * @Description TODO
 * @Author pyt
 * @Date 2019/7/31 11:45
 * @Version
 */
public class Test {
    private static Logger logger = LogManager.getLogger(Test.class);
    public static void main(String[] args) {
        //All < Trace < Debug < Info < Warn < Error < Fatal < OFF
        logger.trace("Hello, World!");
        logger.debug("Hello, World!");
        logger.info("Hello, World!");
        logger.warn("Hello, World!");
        logger.error("Hello, World!");
        logger.fatal("Hello, World!");
    }
}
