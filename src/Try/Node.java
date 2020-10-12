package Try;

/**
 * @author 1
 */
public class Node<T> {
    public T date;
    public Node<T> next;

    public Node(){
        this(null,null);
    }
    public Node(T date,Node<T> next){
        this.date = date;
        this.next = next;
    }

}
