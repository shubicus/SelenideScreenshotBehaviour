package app;

import app.tasks.TaskChrome;
import app.tasks.TaskFirefox;
import com.codeborne.selenide.SelenideDriver;

public class Main {

    public static void main(String[] args) {

        new TaskFirefox().start();
        new TaskChrome().start();

    }

    public static synchronized void reloadProcess(SelenideDriver browser) {

        Thread thread = new Thread(() -> {
            browser.open("https://www.bbc.com/");
            new MyPage(browser);
        });

        thread.setName(browser.browser().name);

        thread.start();
    }

}
