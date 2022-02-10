package junit;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJUnitTest {

    @BeforeEach
    void openBrowser() {
        Selenide.open("https://ya.ru");
    }

    @AfterEach
    void closeBrowser() {
        Selenide.closeWebDriver();
    }

    @Test
    void textTest() {
        // search for text
    }

    @Test
    void videoTest() {
        // search for video
    }
}
