package app;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.impl.ScreenShotLaboratory;

public class MyPage {

    private final SelenideDriver selenideDriver;

    public MyPage(SelenideDriver selenideDriver) {
        this.selenideDriver = selenideDriver;
        makeScreenshot();
    }

    private void makeScreenshot() {
        Selenide.screenshot(Thread.currentThread().getName() + "_" + System.currentTimeMillis() + "_1");
        Screenshots.takeScreenShot(Thread.currentThread().getName() + "_" + System.currentTimeMillis() + "_2");
        ScreenShotLaboratory.getInstance().takeScreenShot(selenideDriver.driver(), Thread.currentThread().getName() + "_" + System.currentTimeMillis() + "_3");
    }

}
