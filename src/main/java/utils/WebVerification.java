package utils;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebVerification {
    private static final Logger logger = LoggerFactory.getLogger(WebVerification.class.getName());


    public void assertTrue(String msg , boolean actual){
        Assert.assertTrue(msg, actual);
        if(actual) {
            logger.info(msg);
        }else{
            logger.error(msg + " got error");
        }
    }
}

