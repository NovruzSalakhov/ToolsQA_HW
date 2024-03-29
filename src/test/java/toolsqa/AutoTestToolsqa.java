package toolsqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutoTestToolsqa {

    @BeforeAll
    static void BeforeAll() {
        Configuration.holdBrowserOpen=true;
        Configuration.browser="chrome";
        // Configuration.browserSize="1920x1080";

    }
    @Test
   void CheckFormTools() {

        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName").setValue("Novruz");
        $("#lastName").setValue("Salakhov");
        $("[id=userEmail]").setValue("salakhov-novruz@mail.ru");
        $("#genterWrapper #gender-radio-1").parent().click();
        // другие варианты $("#genterWrapper").$(byText("Male")).click() и $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("89258843279");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        // или $(".react-datepicker__month-select").selectOptionByValue("5");
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__day--017").click();
        $("[id=subjectsInput]").setValue("Maths").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        // или 2 вариант $(byText("Sports")).click();
        $("[id=uploadPicture]").uploadFile(new File("src/test/resources/img/1.png"));
        // $("[id=uploadPicture]").uploadFromClasspath("img/1.png");
        $("[id=currentAddress]").setValue("Moscow, Arbat street 33");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("[id=submit]").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Novruz"), text("Salakhov"));



    }
}