package aquality.appium.mobile.template.cucumber.hooks;

import aquality.appium.mobile.application.AqualityServices;
import io.cucumber.java.After;

import static aquality.appium.mobile.application.AqualityServices.getApplication;

public class ApplicationHooks {

    @After(order = 0)
    public void closeApplication() {
        if (AqualityServices.isApplicationStarted()) {
            getApplication().terminate();
            getApplication().quit();
        }
    }
}
