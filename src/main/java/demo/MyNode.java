package demo;

public class MyNode<T> implements INode<T>{
    private T key;
    private INode<T> next;

    public MyNode(T key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setkey(T key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }
}
