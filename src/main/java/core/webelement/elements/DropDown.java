package core.webelement.elements;

/**
 * Created by AMBER on 22.01.2017.
 */
public interface DropDown extends Element {
    DropDown unfold();

    void selectAndClick(final String value);

    void selectAndHover(final String value);
}
