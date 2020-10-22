package xl.lists;

import ListDemo.Node;

/**
 * @ClassName SinglyList
 * @Description TODO
 * @Author 1
 * @Date 2020/10/22
 **/
public class SinglyList<T extends Comparable> {
    public Node<T> head;

    public SinglyList() {
        this.head = new Node<T>();
    }
    public SinglyList(T[] values) {
        this();
        Node<T> rear = this.head;
        for (T value : values) {
            if (value != null) {
                rear.next = new Node<T>(value, null);
                rear = rear.next;
            }
        }
    }

    public boolean isEmpty() {
        return this.head.next == null;
    }
    public T get(int i) {
        Node<T> p = this.head.next;
        for (int j = 0; p != null & j < i; j++) {
            p = p.next;
        }
        return (i >= 0 && p != null) ? p.data : null;
    }

    public void print() {
        Node<T> p = head.next;
        while (p != null) {
            System.out.print(p.data);
            p = p.next;
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        String str = this.getClass().getName() + "(";
        for (Node<T> p = this.head.next; p != null; p = p.next) {
            str += p.data.toString() + (p.next != null ? "," : "");
        }
        return str + "(";
    }

    public Node<T> insert(int i, T x) {
        if (x == null) {
            return null;
        }
        Node<T> front = this.head;
        for (int j = 0; front.next != null && j < i; j++) {
            front = front.next;
        }
        front.next = new Node<T>(x, front.next);
        return front.next;
    }

    public Node<T> insert(T x) {
        return insert(Integer.MAX_VALUE, x);
    }

    public T remove(int i) {
        Node<T> front = this.head;
        for (int j = 0; front.next != null && j < i; j++) {
            front = front.next;
        }
        if (i >= 0 && front.next != null) {
            T x = front.next.data;
            front.next = front.next.next;
            return x;
        }
        return null;
    }

    public void clear() {
        this.head.next = null;
    }

    public void set(int i, T x) {
        Node<T> p = head.next;
        for (int j = 1; p.next != null && j < i; j++) {
            p = p.next;
        }
        if (i > 0 && p.next != null) {
            p.data = x;
        }
    }

    public int size() {
        Node<T> p = head.next;
        int count = 1;
        for (int j = 1; p.next != null; j++) {
            p = p.next;
            count++;
        }
        return count;
    }

    public Node<T> search(T key) {
        Node<T> p = head.next;
        int count = 0;
        while (key != p.data && p.next != null) {
            p = p.next;
            count++;
        }
        if (count < size()) {
            return p;
        } else {
            return null;
        }
    }

    public T remove(T key) {
        Node<T> p = head.next;
        int count = 0;
        while (key != p.data && p.next != null) {
            p = p.next;
            count++;
        }
        if (count < size() && p.next != null) {
            remove(count);
            return key;
        } else {
            return null;
        }
    }

    public void Reverse1(ListDemo.SinglyList<T> L) {
        Node<T> p = L.head.next, q;
        L.head.next = null;
        while (p != null) {
            q = p.next;
            p.next = L.head.next;
            L.head.next = p;
            p = q;
        }
    }

    public <T extends Comparable> void Reverse2(ListDemo.SinglyList<T> L) {
        Node<T> p = L.head.next, succ = null, front = null;
        while (p != null) {
            succ = p.next;
            p.next = front;
            front = p;
            p = succ;
        }
        L.head.next = front;
    }

    public Node<T> merge(ListDemo.SinglyList list2) {
        Node<T> p, t, q;
        t = this.head;
        p = this.head.next;
        q = list2.head.next;
        if (p == null) {
            return (list2.head);
        }
        if (q == null) {
            return (this.head);
        }
        while (p != null && q != null) {
            if (p.data.compareTo(q.data) == 0) {
                p = p.next;
                t = t.next;
                q = q.next;
            } else if (p.data.compareTo(q.data) < 0) {
                p = p.next;
                t = t.next;
            } else {
                t.next = q;
                q = q.next;
                t = t.next;
                t.next = p;
            }
        }
        if (q != null) {
            t.next = q;
        }
        return null;
    }
    public Node<T> erwei(ListDemo.SinglyList list2) {
        Node<T> p, t, q;
        t = this.head;
        p = this.head.next;
        q = list2.head.next;
        if (p == null) {
            return (list2.head);
        }
        if (q == null) {
            return (this.head);
        }
        while (p != null && q != null) {
            if (p.data.compareTo(q.data) == 0) {
                p = p.next;
                t = t.next;
                q = q.next;
            } else if (p.data.compareTo(q.data) < 0) {
                p = p.next;
                t = t.next;
            } else {
                t.next = q;
                q = q.next;
                t = t.next;
                t.next = p;
            }
        }
        if (q != null) {
            t.next = q;
        }
        return null;
    }

}
