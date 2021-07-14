package cms;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author Suqlain Sher
 */
public class STU_CHATTest {
    
    @Test
    public void testDownloadChat() {
        STU_CHAT instance = new STU_CHAT();
        System.out.println("DownloadChat");
        String str, expResult;
        expResult="HELLO";
        str=instance.DownloadChat("HELLO");
        assertEquals(expResult,str);
        // TODO review the generated test code and remove the default call to fail.
    }
}
