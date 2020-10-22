package Stack;

/**
 * @ClassName TestMain
 * @Description TODO
 * @Author 1
 * @Date 2020/10/13
 **/
public class TestMain {
    public static void main(String[] args) {
        SeqStack<String> seqStack = new SeqStack<String>();
        seqStack.push("22");
        seqStack.push("aa");
        seqStack.push("bb");
        seqStack.push("cc");
        seqStack.push("55");
        seqStack.pop();
        System.out.println(seqStack.toString());
    }
}
