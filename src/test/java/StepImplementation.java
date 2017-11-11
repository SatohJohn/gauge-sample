import com.codeborne.selenide.Selenide;
import com.thoughtworks.gauge.Step;

public class StepImplementation {
    @Step("<url>を開く")
    public void open(String url) {
        Selenide.open(url);
    }
}
