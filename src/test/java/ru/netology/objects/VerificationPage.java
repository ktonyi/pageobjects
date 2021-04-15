package ru.netology.objects;



import com.codeborne.selenide.SelenideElement;
import ru.netology.data.UserData;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private SelenideElement codeField = $("input[name=\"code\"]");
    private SelenideElement verifyButton = $("[data-test-id=action-verify]");

    public VerificationPage() {
        codeField.shouldBe(visible);
    }

    public DashboardPage validVerify(UserData.VerificationCode code) {
        codeField.setValue(code.getCode());
        verifyButton.click();
        return new DashboardPage();
    }
}
