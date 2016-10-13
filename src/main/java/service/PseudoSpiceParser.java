package service;

import model.*;
import model.components.*;

import java.io.File;
import java.util.List;

/**
 * Created by Jennifer on 10/10/2016.
 *
 * Takes the pseudo-spice txt file representing circuit interpreted from opencv and parses it into a Circuit
 */
public class PseudoSpiceParser implements CircuitParser{

    private List<CircuitNode> nodes;
    private List<CircuitElm> elements;

    /**
     * Parses pseudo-spice txt file into nodes and elements
     * @param f file to parse
     * @modifies nodes to contain all circuit nodes for Modified Nodal Analysis
     * @modifies elements to contain all circuit elements
     */
    public void parse(File f){
        //For each line...
        //CircuitElm elm = parseLineToElm()
        //elements.add(elm)
        //...
        //parseNodes()
        //TODO
    }

    public List<CircuitNode> getNodes(){
        return null; //TODO
    }

    public List<CircuitElm> getElements(){
        return null; //TODO
    }

    //Constructs circuit element from line
    private CircuitElm parseLineToElm(String line){
        return null; //TODO
    }

    //Finds circuit nodes and adds them to nodes list
    private void parseNodes(){

    }

    //TODO: rough method... redesign
    public CircuitElm createElement(char c, double value){
        if(c == 'r'){
            return new ResistorElm(value);
        }
        else if(c == 'w'){
            return new WireElm();
        }
        else if(c =='v'){
            return new VoltageElm(value);
        }
        else{
            throw new RuntimeException( c + " does not correspond to a circuit element");
        }
    }
}
