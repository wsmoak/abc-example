package net.wsmoak.abc;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;
import junit.framework.TestCase;


public class WebappTest extends TestCase {

    private Selenium selenium;

	public void setUp() throws Exception {
        selenium = new DefaultSelenium( "localhost", 4444, "*firefox", "http://localhost:8080" );
        selenium.start();
	}

    public void tearDown() throws Exception {
	    selenium.stop();
    }

	public void testNew() throws Exception {
		selenium.open("http://localhost:8080/abc/");
        Thread.sleep(2500);
		assertTrue(selenium.isTextPresent("Hello World!"));
        Thread.sleep(2500);
	}
}
