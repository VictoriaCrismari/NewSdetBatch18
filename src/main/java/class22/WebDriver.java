package class22;

public interface WebDriver {
     void openBrowser();
     void closeBrowser();
     void maximizeWindow();
     void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Browser Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Browser Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window Google Chrome");

    }

    @Override
    public void findElement() {
        System.out.println("Find Element in Google Chrome");
    }
}
class FirefoxDriver implements WebDriver{
    public void openBrowser(){
        System.out.println("Open Browser FireFox");
        }

    @Override
    public void closeBrowser() {
        System.out.println("Close Browser FireFox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Close window FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("Find Element in FireFox");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver [] array={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver w:array){
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();
        }
    }
}