package Stack;

import ListDemo.SeqList;

/**
 * @ClassName SeqStack
 * @Description TODO
 * @Author 1
 * @Date 2020/10/13
 **/
public class SeqStack<T> implements Stack<T>{

    /**
     * 顺序表
     */
    private SeqList<T> list;

    /**
     * 空栈
     */
    public SeqStack(int capacity){
        list = new SeqList<T>(capacity);
    }

    /**
     * 空栈
     */
    public SeqStack(){
        this(16);
    }

    /**
     * 判断栈是否为空
     */
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    /**
     * 元素 x入栈
     */
    @Override
    public void push(T x) {
        list.insert(x);
    }

    /**
     * 返回栈顶元素，未出栈
     */
    @Override
    public T peek() {
        return null;
    }

    /**
     * 出栈，返回栈顶元素
     */
    @Override
    public T pop() {
        if(this.list.size()<1){
            return null;
        }
        list.remove(list.size());
        return list.get(list.size());
    }

    @Override
    public String toString() {
        return "SeqStack{" +
                "list=" + list +
                '}';
    }
}
