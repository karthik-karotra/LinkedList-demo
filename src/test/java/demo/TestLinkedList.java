package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLinkedList {
    @Test
    public void testAddNodesToLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedListDemo myLinkedListDemo = new MyLinkedListDemo();
        myLinkedListDemo.add(myFirstNode);
        myLinkedListDemo.add(mySecondNode);
        myLinkedListDemo.add(myThirdNode);
        myLinkedListDemo.printMyNodes();
        boolean result = myLinkedListDemo.head.equals(myThirdNode) &&
                         myLinkedListDemo.head.getNext().equals(mySecondNode) &&
                         myLinkedListDemo.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void testAppendNodesToLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedListDemo myLinkedListDemo = new MyLinkedListDemo();
        myLinkedListDemo.add(myFirstNode);
        myLinkedListDemo.append(mySecondNode);
        myLinkedListDemo.append(myThirdNode);
        myLinkedListDemo.printMyNodes();
        boolean result = myLinkedListDemo.head.equals(myFirstNode) &&
                myLinkedListDemo.head.getNext().equals(mySecondNode) &&
                myLinkedListDemo.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void testInsertNodeInBetweenNodesToLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedListDemo myLinkedListDemo = new MyLinkedListDemo();
        myLinkedListDemo.add(myFirstNode);
        myLinkedListDemo.append(myThirdNode);
        myLinkedListDemo.insert(myFirstNode,mySecondNode);
        myLinkedListDemo.printMyNodes();
        boolean result = myLinkedListDemo.head.equals(myFirstNode) &&
                myLinkedListDemo.head.getNext().equals(mySecondNode) &&
                myLinkedListDemo.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
    @Test
    public void testPopFirstNodeToLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedListDemo myLinkedListDemo = new MyLinkedListDemo();
        myLinkedListDemo.add(myFirstNode);
        myLinkedListDemo.append(mySecondNode);
        myLinkedListDemo.append(myThirdNode);
        myLinkedListDemo.popFirst();
        myLinkedListDemo.printMyNodes();
        boolean result = myLinkedListDemo.head.equals(mySecondNode) &&
                myLinkedListDemo.head.getNext().equals(myThirdNode)&&
                myLinkedListDemo.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
    @Test
    public void testPopLastNodeToLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedListDemo myLinkedListDemo = new MyLinkedListDemo();
        myLinkedListDemo.add(myFirstNode);
        myLinkedListDemo.append(mySecondNode);
        myLinkedListDemo.append(myThirdNode);
        myLinkedListDemo.popLast();
        myLinkedListDemo.printMyNodes();
        boolean result = myLinkedListDemo.head.equals(myFirstNode) &&
                myLinkedListDemo.head.getNext().equals(mySecondNode) &&
                myLinkedListDemo.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }
}
