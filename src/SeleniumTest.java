import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2011");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Brak kwalifikacji", closeAlertAndGetItsText());
    }

    @Test
    public void test2() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2010");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Mlodzik", closeAlertAndGetItsText());
    }

    @Test
    public void test3() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-200");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2007");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Mlodzik", closeAlertAndGetItsText());
    }

    @Test
    public void test4() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2006");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath("//form[@id='formma']/div[5]/div/div/label")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Junior", closeAlertAndGetItsText());
    }

    @Test
    public void test5() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2003");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Junior", closeAlertAndGetItsText());
    }

    @Test
    public void test6() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2002");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Dorosly", closeAlertAndGetItsText());
    }

    @Test
    public void test7() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2002");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Dorosly", closeAlertAndGetItsText());
    }

    @Test
    public void test8() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-1997");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Dorosly", closeAlertAndGetItsText());
    }

    @Test
    public void test9() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-1956");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Dorosly", closeAlertAndGetItsText());
    }

    @Test
    public void test10() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-1955");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Senior", closeAlertAndGetItsText());
    }

    @Test
    public void test11() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2008");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Blad danych", closeAlertAndGetItsText());
    }

    @Test
    public void test12() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2008");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Blad danych", closeAlertAndGetItsText());
    }

    @Test
    public void test13() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-2005");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Blad danych", closeAlertAndGetItsText());
    }

    @Test
    public void test14() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-1952");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Blad danych", closeAlertAndGetItsText());
    }

    @Test
    public void test15() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Maro123");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Marko*&^");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-11-1995");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Blad danych", closeAlertAndGetItsText());
    }

    @Test
    public void test16() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("30-14-1995");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Blad danych", closeAlertAndGetItsText());
    }

    @Test
    public void test17() throws Exception {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).clear();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marek");
        driver.findElement(By.id("inputPassword3")).clear();
        driver.findElement(By.id("inputPassword3")).sendKeys("Markowski");
        driver.findElement(By.id("dataU")).clear();
        driver.findElement(By.id("dataU")).sendKeys("35-11-1995");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlertAndGetItsText();
        assertEquals("Blad danych", closeAlertAndGetItsText());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
