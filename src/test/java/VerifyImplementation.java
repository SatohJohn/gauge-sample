import com.codeborne.selenide.Selenide;
import com.thoughtworks.gauge.Step;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class VerifyImplementation {
    @Step("タイトルが<title>であること")
    public void verifyTitle(String title) {
        String actual = Selenide.title();
        Assert.assertThat(actual, CoreMatchers.is(title));
    }
}
