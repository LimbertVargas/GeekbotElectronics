package geekbotelectronics.utils;

import org.openqa.selenium.WebElement;

public abstract class WebDriverHelper {
    public static void enterKeys(final WebElement textBox, final String stringKeys) {
        textBox.click();
        textBox.clear();
        textBox.sendKeys(stringKeys);
    }
}
