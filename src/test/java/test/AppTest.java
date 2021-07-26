package test;

import org.testng.annotations.Test;
import vaccination.App;
import vaccination.Main;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void test01() {
        App.register("Eduardo", "odraudE");
        App.login("Eduardo", "odraudE");
    }

    @Test
    public void test02() {
    }
}
