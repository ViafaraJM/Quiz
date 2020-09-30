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
public class ListaDoble {
    DoubleNode head, tail;

    public ListaDoble() {
        head = tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }
    
    public void Repetido(){
        DoubleNode actual = head;
        DoubleNode ultimo = tail;
        int repetido = 0;
        while(actual!=ultimo.getNextNode()){
            repetido = actual.getData();
            while(actual!=ultimo.getNextNode()){
                if(actual.getNextNode().getData() == repetido){
                    actual = actual.getNextNode();
                    actual.getNextNode().setPreviosNode(null);
                }
                actual = actual.getNextNode();
            }
            actual = actual.getNextNode();
        }
    }
    
}
