package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchArticle extends PageObject {
    public static final Target BODY =  Target.the("article identifier").locatedBy("//article");
}
