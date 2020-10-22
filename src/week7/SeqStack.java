package week7;

import ListDemo.SeqList;
import sun.print.PeekGraphics;

/**
 * @ClassName SeqStack
 * @Description 顺序栈
 * @Author UnKnW
 * @Date 2020/10/13
 **/
public final class SeqStack<T> {
    private SeqList<T> list;

    public SeqStack(int length) {
        this.list = new SeqList<T>(length);
    }

    public SeqStack()
    {
        this(64);
    }
    public boolean isEmpty()
    {
        return this.list.isEmpty();
    }
    public void push(T x)
    {
        this.list.insert(x);
    }
    public T peek()
    {
        return this.list.get(list.size()-1);
    }
    public T pop()
    {
        return list.remove(list.size()-1);
    }
}
