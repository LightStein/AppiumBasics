package iOSTest;
import com.mobile.AppTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestApp {
    @Test
    public void test() throws MalformedURLException {
        AppTest.iOSLaunchApp();
    }
    @AfterTest
    public void Teardown(){
        AppTest.CloseApp();
    }
}
