package ListDemo;

public class SinglyList<T> implements ListDemo {
    public Node<T> head;

    public SinglyList(){
        head = new Node<T>();
    }
    public SinglyList(T[] vas){
        this();
        Node<T> real = this.head;
        for (int i = 0; i < vas.length; i++) {
            if(vas[i] != null){
                real.next = new Node<T>(vas[i],null);
                real = real.next;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    @Override
    public int size() {
        int i = 0 ;
        Node<T> p = head;
        while ( p != null){
            i++;
            p = p.next;
        }
        return i;
    }

    @Override
    public Object get(int i) {
        Node<T> p = this.head.next;
        for (int j = 0; j < i && p != null; j++) {
            p = p.next;
        }
        return ( i >= 1 && p != null ) ? p.date : null;
    }

    @Override
    public void set(int i, Object x) {
        Node<T> p = this.head.next;
        for (int j = 0; j < i && p != null; j++) {
            p = p.next;
        }
        p.date = (T)x;
    }

    @Override
    public int insert(int i, Object x) {
        if( x == null )
            return -1;
        Node<T> p = this.head;
        if( i == 0 ){
            p = new Node<T>((T)x,this.head.next);
            this.head = p;
            return i;
        }
        for (int j = 1; j < i && p != null; j++) {
            p = p.next;
        }
        return -1;
        //////////////////////////////////////////////////
    }

    @Override
    public int insert(Object x) {
        return 0;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int search(Object key) {
        return 0;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }
}
