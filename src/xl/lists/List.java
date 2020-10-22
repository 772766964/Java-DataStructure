package xl.lists;

/**
 * @author 1
 */
public interface List<T> {
    boolean isEmpty();  //元素是否为空
    int size();     //元素长度
    T get(int i);
    void set(int i , T x);
    int insert(int i, T x);    //指定位置插入
    int insert(T x);       //末尾插入
    T remove(int i);
    void clear();   //删除所有元素；
    int search(T key);
    T remove(T key);
}
