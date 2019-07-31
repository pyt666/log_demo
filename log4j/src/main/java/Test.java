import org.apache.log4j.Logger;

/**
 * @ClassName Test
 * @Description TODO
 * @Author pyt
 * @Date 2019/7/31 11:24
 * @Version
 */
public class Test {
    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println("test");
        logger.info("test");
    }
}
