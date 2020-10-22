package week7;

import Try.SinglyList;


/**
 * @author 1
 */
public final class LinkedStack<T extends Comparable> {
    private final SinglyList<T> list;
    public LinkedStack()
    {
        this.list = new SinglyList<T>();
    }
    public boolean isEmpty()
    {
        return this.list.isEmpty();
    }
    public  void push(T x)
    {
        this.list.insert(0,x);
    }
    public T peek()
    {
        return this.list.get(0);
    }
    public T pop()
    {
        return this.list.remove(0);
    }
}

