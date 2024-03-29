package toolsqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutoTestToolsqa {

    @BeforeAll
    static void BeforeAll() {
        Configuration.holdBrowserOpen=true;
        Configuration.browser="chrome";
        Configuration.browserSize="1920x1080";

    }
    @Test
   void CheckFormTools() {

        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName").setValue("Novruz");
        $("#lastName").setValue("Salakhov");
        $("[id=userEmail]").setValue("salakhov-novruz@mail.ru");
        // $("#genterWrapper #gender-radio-1").click(); Gender
        $("#userNumber").setValue("89258843279");
        // Date of Birth
        //$("[id=subjectsContainer]").setValue("Physics"); Subject
        // Hobbies
        // Picture
        $("[id=currentAddress]").setValue("Moscow, Arbat street 33");
        // State and City
        // Submit


    }
}