package app.tasks;

import app.Main;
import app.browsers.MyChromeWebDriver;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;

public class TaskChrome extends Thread {

    @Override
    public void run() {
        SelenideDriver browser = new SelenideDriver(new SelenideConfig().browser(MyChromeWebDriver.class.getName()));

        Main.reloadProcess(browser);
    }
}
