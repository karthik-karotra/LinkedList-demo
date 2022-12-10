package demo;

public class MyStack {
    private final MyLinkedListDemo myLinkedList ;

    public MyStack() {
        this.myLinkedList = new MyLinkedListDemo();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.popFirst();
    }
}
