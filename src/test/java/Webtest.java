import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtest {

    public static void main(String[] args) {

        WebDriver zapysk = new ChromeDriver();
        zapysk.get("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        zapysk.close();
    }



}