package app.tasks;

import app.Main;
import app.browsers.MyFirefoxWebDriver;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;

public class TaskFirefox extends Thread {

    @Override
    public void run() {
        SelenideDriver browser = new SelenideDriver(new SelenideConfig().browser(MyFirefoxWebDriver.class.getName()));

        Main.reloadProcess(browser);
    }
}
