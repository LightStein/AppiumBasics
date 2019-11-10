package androidTest;
import com.mobile.AppTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static com.mobile.AppTest.driver;

public class TestApp {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AppTest.AndroidLaunchApp();
    }
    @AfterTest
    public void Teardown(){
        AppTest.CloseApp();
    }
}
