package ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SeqList<T> implements ListDemo<T>{
    private int n;
    private Object[] element;
    private static final int MIN_LENGTH = 16;

     public SeqList(){
         this(MIN_LENGTH);
     }

     public  SeqList(int length){
         LinkedList as = new LinkedList();
         element = new Object[length];
         n = 0;
     }
     public  SeqList(T[] t){
         this(t.length*2);
         for(int i = 0; i < t.length ; i++){
             if(t[i] != null){
                 element[n++] = t[i];
             }
         }
     }

    @Override
    public String toString() {
        String str = this.getClass().getName() + "(";
        if (this.n > 0)
            str += this.element[0].toString();
        for (int i = 1; i < this.n; i++)
            str += "," + this.element[i].toString();
        return str + ")";
    }

    @Override
    public boolean isEmpty() {
//         if(n >= 0)
//             return false;
//         else
//             return true;
        return this.n == 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public T get(int i) {
         if(i >= 0 && i < element.length)
             return (T) element[i];
         return null;
    }

    @Override
    public void set(int i, T x) {
        if(i < 0 && i > element.length)
            new Exception("错误");
        element[i] = x;
    }

    @Override
    public int insert(int i, T x) {
         if(x == null)
             return -1;
         if( i < 0)
             i = 0;
         if(i >= element.length)
             i = this.n;

         Object[] source = this.element;
         if(this.n == element.length){
             element = new Object[source.length * 2];
             System.arraycopy(source,0,element,0,source.length);
         }
        for (int j = n-1; j >= i ; j--)
            element[j] = element[j-1];
        element[i] = x;
        n++;
        return i;
    }

    @Override
    public int insert(T x) {
        return this.insert(n,x);
    }

    @Override
    public T remove(int i) {
         T x = (T) element[i];
         if(n >= 0 && n < element.length){
             for (int j = i ; j < n-1 ; j++){
                 element[i] = element[i+1];
             }
             n--;
             return x;
         }
         return null;
    }

    @Override
    public void clear() {
        n = 0;
    }

    @Override
    public int search(T key) {
         for(int i = 0 ; i <= element.length ; i++){
             return element[i] == key ? i : -1 ;
         }
         return -1;
    }

    @Override
    public T remove(T key) {
        return null;
    }
}
