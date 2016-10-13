package service;

import model.CircuitNode;
import model.components.CircuitElm;

import java.util.List;

/**
 * Created by Jennifer on 10/12/2016.
 */
public interface CircuitParser {

    /**
     *
     * @return list of nodes parsed from file
     */
    public List<CircuitNode> getNodes();

    /**
     *
     * @return list of elements parsed from file
     */
    public List<CircuitElm> getElements();
}
