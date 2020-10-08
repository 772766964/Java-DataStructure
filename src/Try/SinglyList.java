package Try;

import java.util.jar.JarEntry;

/**
 * @author 1
 */
public class SinglyList<T> {
    Node<T> head;
    public SinglyList(){
        head = new Node<T>();
    }
    public SinglyList(T[] values){
        this();
        Node<T> p = head;
        for (T value : values) {
            if (value != null) {
                p.next = new Node<>(value, null);
                p = p.next;
            }
        }
    }

    public boolean isEmpty() {
        return this.head.next == null;
    }

    public int size() {
        int i = 0 ;
        Node<T> p = head.next;
        while ( p != null){
            i++;
            p = p.next;
        }
        //最后返回存储的数据大小
        return i;
    }

    public T get(int i) {
        Node<T> p = this.head.next;
        for (int j = 0; j < i && p != null; j++) {
            p = p.next;
        }
        return ( i >= 1 && p != null ) ? p.date : null;
    }

    public void set(int i, T x) {
        Node<T> p = this.head.next;
        for (int j = 0; j < i && p != null; j++) {
            p = p.next;
        }
        p.date = x;
    }


    public T remove(int i) {
        Node<T> front = this.head;
        for (int j = 0; j < i && front.next != null; j++) {
            front = front.next;
        }
        if(i>=0 && front.next != null){
            T x = front.next.date;
            front.next = front.next.next;
            return x;
        }
        return null;
    }

    public T remove(T key){
        Node<T> front = head.next;
        while (front.next != null ){
            if( front.next.date == key && front.next.next!= null){
                front.next = front.next.next;
                return front.date;
            }
            front = front.next;
        }
        return null;
    }

    public Node<T>  search(T key) {
        Node<T> p = head.next;
        if(head.next==null){
            return null;
        }
        while (p.date!=key && p.next!=null){
            p = p.next;
        }
        return p.date==key?p:null;
    }

    public void clear(){
        head.next = null;
    }

    public Node<T> insert(int i, T x){
        if(x==null){
            return null;
        }
        Node<T> front = this.head;
        for (int j = 0; j < i && front.next != null; j++) {
            front = front.next;
        }
        front.next = new Node<T>(x,front.next);
        return front.next;
    }

    public Node<T> insert(T x){
        return insert(Integer.MAX_VALUE,x);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(this.getClass().getName() + "(");
        for(Node<T> p = this.head.next; p!=null; p=p.next){
            str.append(p.date.toString()).append(p.next != null ? "," : ")");
        }
        return str.toString();
    }
}