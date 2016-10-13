package model.components;

import model.CircuitNode;

import java.awt.*;

/**
 * Created by Jennifer on 10/10/2016.
 */
public abstract class CircuitElm {

    protected CircuitNode[] nodes; //nodes that element is connected to
    protected Point[] points; //coordinates of either end of the component

    /**
     * Find the voltage difference across the element
     * @return
     */
    public abstract double getVoltageDiff();

    /**
     * Find the current flowing through the element
     * @return
     */
    public abstract double calculateCurrent();

}
