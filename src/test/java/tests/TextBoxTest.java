package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

public class TextBoxTest {

    @BeforeAll
    static void before() {
        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void successFileTest() {
        open("/text-box");
        $(".main-header").shouldHave(text("Text Box"));
        $("#userName").setValue("gusigusigagaga");
        $("#userEmail").setValue("dolgoexali@kuda.da");
        $("#currentAddress").setValue("Na derevnyu k dedu");
        $("#permanentAddress").setValue("I prishli k obedu");
        $("#submit").scrollTo().click();



        $("#output").shouldHave(text("gusigusigagaga"),
                text("dolgoexali@kuda.da"), text("Na derevnyu k dedu"), text("I prishli k obedu"));
        //$("#currentAddress").shouldHave(text("Na derevnyu k dedu"));
        $("#currentAddress", 1).shouldHave(text("Na derevnyu k dedu"));
        $("#output").$("#currentAddress").shouldHave(text("Na derevnyu k dedu"));
        $("#output #currentAddress").shouldHave(text("Na derevnyu k dedu"));
    }
}
