import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Test
 * @Description TODO
 * @Author pyt
 * @Date 2019/7/31 13:34
 * @Version
 */
public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        logger.trace("Hello, World!");
        logger.debug("Hello, World!");
        logger.info("Hello, World!");
        logger.warn("Hello, World!");
        logger.error("Hello, World!");
    }
}
