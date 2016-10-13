package model;

import model.components.CircuitElm;
import java.util.List;

/**
 * Created by jen on 2016-10-13.
 */
public interface Circuit {

    /**
     * Replaces given element, "oldElm", with new element, "newElm".
     * New element has same coordinates as old element.
     * @param oldElm element to be replaced
     * @param newElm element that will replace old element
     *               requires: element-specific values already intialized in newElm
     */
    public void editElement(CircuitElm oldElm, CircuitElm newElm);

    /**
     *
     * @param elm
     * @param value
     */
    public void editElementValue(CircuitElm elm, double value);

    public double getVoltageDiff(CircuitElm elm);

    public double getCurrent(CircuitElm elm);
}
