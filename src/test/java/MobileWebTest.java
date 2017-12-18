import org.junit.Test;

import java.net.URL;

public class MobileWebTest {

    @Test
    public void testIncorrectFBLogin()throws Exception {
        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");

        System.out.println("Step 1: Create new driver");
        System.out.println("Step 2: Open website");
        System.out.println("Step 3: Enter login");
        System.out.println("Step 4: Enter password");
        System.out.println("Step 5: Click login button");
        System.out.println("Step 6: Check error message");
        System.out.println("Step 7: Close");
    }
}
