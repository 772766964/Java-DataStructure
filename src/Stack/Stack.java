package Stack;

/**
 * @ClassName Stack
 * @Description TODO
 * @Author 1
 * @Date 2020/10/13
 **/
public interface Stack<T> {
    /**
     * 判断栈是否为空
     */
    boolean isEmpty();

    /**
     * 元素 x入栈
     */
    void push(T x);

    /**
     * 返回栈顶元素，未出栈
     */
    T peek();

    /**
     * 出栈，返回栈顶元素
     */
    T pop();
}
