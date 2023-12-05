package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchForm extends PageObject {
    public static final Target SEARCH_FIELD = Target.the("search field").locatedBy("#searchbox_input");
}
