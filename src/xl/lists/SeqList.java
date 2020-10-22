package xl.lists;

/**
 * @ClassName SeqList
 * @Description TODO
 * @Author 1
 * @Date 2020/10/22
 **/
public class SeqList<T> implements List<T> {


    protected int n;
    protected Object[] element;
    private static final int MIN_CAPACITY = 16;


    public SeqList(){
        this(MIN_CAPACITY);
    }
    public SeqList(int length){
        length = Math.max(length, MIN_CAPACITY);
        this.element = new Object[length];
        this.n = 0;
    }
    public SeqList(T[] values){
        this(values.length*2);
        for (T value : values) {
            if (value != null) {
                this.element[this.n++] = value;
            }
        }
    }


    @Override
    public boolean isEmpty() {
        return this.n == 0;
    }

    @Override
    public int size() {
        return this.n;
    }

    @Override
    public T get(int i) {
        if (i >= 0 && i < this.n) {
            return (T) this.element[i];
        }
        return null;
    }

    @Override
    public void set(int i, T x) {
        if (x == null) {
            throw new NullPointerException("x==null");
        }
        if (i >= 0 && i < this.n) {
            this.element[i] = x;
        } else {
            throw new java.lang.IndexOutOfBoundsException(i + "");
        }
    }

    @Override
    public int insert(int i, T x) {
        if (x == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > this.n) {
            i = this.n;
        }
        Object[] source = this.element;
        if (this.n == element.length) {
            this.element = new Object[source.length * 2];
            for (int j = 0; j < i; j++)
                this.element[j] = source[j];
        }
        for (int j = this.n - 1; j >= i; j--)
            element[j + 1] = source[j];
        this.element[i] = x;
        n++;
        return i;
    }

    @Override
    public int insert(T x) {
        return this.insert(this.n, x);
    }

    @Override
    public T remove(int i) {
        if (i < this.n && i >= 0) {
            T x = (T) element[i];
            for (int j = i; j < this.n - 1; j++) {
                this.element[j] = this.element[j + 1];
            }
            this.element[n - 1] = null;
            this.n--;
            return x;
        }
        return null;
    }

    @Override
    public void clear() {
        this.n = 0;
    }

    @Override
    public int search(T key) {
        for (int i = 0; i < this.n; i++) {
            if (key.equals(this.element[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T remove(T key) {
        return remove(search(key));
    }


    @Override
    public String toString() {
        String str = this.getClass().getName() + "(";
        if (this.n > 0) {
            str += this.element[0].toString();
        }
        for (int i = 1; i < this.n; i++) {
            str += "," + this.element[i].toString();
        }
        return str + ")";

    }
}
