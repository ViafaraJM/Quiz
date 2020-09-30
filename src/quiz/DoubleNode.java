/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Sebas
 */
public class DoubleNode {
    private int data;
    private DoubleNode nextNode;
    private DoubleNode previosNode;
    
    public DoubleNode(int d){
        this.data = d;
        this.nextNode = null;
        this.previosNode = null;
    }
    
    public DoubleNode(DoubleNode previosNode, int data, DoubleNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.previosNode = previosNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleNode getPreviosNode() {
        return previosNode;
    }

    public void setPreviosNode(DoubleNode previosNode) {
        this.previosNode = previosNode;
    }
    
}
