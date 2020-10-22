package Try;

/**
 * @author 1
 */
public class SinglyList<T extends Comparable> extends Object {
    Node<T> head;
//    // 尾部指针
//    Node<T> rear;

    public SinglyList() {
        head = new Node<T>();
    }

    public SinglyList(Node<T> node) {
        this();
        this.head.next = node;
    }

    public SinglyList(T[] values) {
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
        int i = 0;
        Node<T> p = head.next;
        while (p != null) {
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
        return (i >= 1 && p != null) ? p.date : null;
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
        if (i >= 0 && front.next != null) {
            T x = front.next.date;
            front.next = front.next.next;
            return x;
        }
        return null;
    }

    public T remove(T key) {
        Node<T> front = head.next;
        while (front.next != null) {
            if (front.next.date == key && front.next.next != null) {
                front.next = front.next.next;
                return front.date;
            }
            front = front.next;
        }
        return null;
    }

    public Node<T> search(T key) {
        Node<T> p = head.next;
        if (head.next == null) {
            return null;
        }
        while (p.date != key && p.next != null) {
            p = p.next;
        }
        return p.date == key ? p : null;
    }

    public void clear() {
        head.next = null;
    }

    public Node<T> insert(int i, T x) {
        if (x == null) {
            return null;
        }
        Node<T> front = this.head;
        for (int j = 0; j < i && front.next != null; j++) {
            front = front.next;
        }
        front.next = new Node<T>(x, front.next);
        return front.next;
    }

    public Node<T> insert(T x) {
        return insert(Integer.MAX_VALUE, x);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(this.getClass().getName() + "(");
        for (Node<T> p = this.head.next; p != null; p = p.next) {
            str.append(p.date.toString()).append(p.next != null ? "," : ")");
        }
        return str.toString();
    }

    public void reserve() {
        Node<T> p = this.head.next, q;
        this.head.next = null;
        while (p != null) {
            q = p.next;
            p.next = this.head.next;
            this.head.next = p;
            p = q;
        }
    }

    public void reserve1() {
        Node<T> p = this.head.next, succ = null, front = null;
        while (p != null) {
            succ = p.next;
            p.next = front;
            front = p;
            p = succ;
        }
        this.head.next = front;
    }


    public Node<T> merge(SinglyList list2)
    {
        Node<T> t,p,q;
        p=this.head.next;
        t=this.head;
        q=list2.head.next;
        if(p==null)
        {
            return (list2.head);
        }
        if (q==null)
        {
            return (this.head);
        }
        while (p!=null &&q!=null)
        {
            if (p.date.compareTo(q.date) == 0)
            {
                p=p.next;
                q=q.next;
                t=t.next;

            }
            else if (p.date.compareTo(q.date) < 0)
            {
                p=p.next;
                t=t.next;
            }
            else
            {
                t.next=q;
                q=q.next;
                t=t.next;
                t.next=p;
            }
        }
        if(q !=null)
        {

            t.next=q;
        }
        return null;
    }
}
