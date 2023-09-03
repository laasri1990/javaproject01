package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class deleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver c=new ChromeDriver();
        c.navigate().to("https://facebook.com");
        System.out.println(c.getTitle());
        Thread.sleep(3000);
        c.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        c.navigate().refresh();
        Thread.sleep(3000);
        c.navigate().back();
        Thread.sleep(3000);
        c.close();

    }
}
