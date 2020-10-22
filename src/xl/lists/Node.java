package xl.lists;

/**
 * @ClassName Node
 * @Description TODO
 * @Author 1
 * @Date 2020/10/22
 **/
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(){
        this(null,null);
    }
    public Node( T data , Node<T> next ){
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
