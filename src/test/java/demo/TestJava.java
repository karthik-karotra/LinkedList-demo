package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJava {
    @Test
    public void method1() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(15);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(20);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(25);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);

    }
}
