package ListDemo;

public class Node<T> {


    public T date;
    public Node<T> next;


    public Node(T date,Node<T> next){
        this.date = date;
        this.next = next;
    }
    public Node(){
        this(null,null);
    }


    @Override
    public String toString() {
        return this.date.toString();
    }
}
