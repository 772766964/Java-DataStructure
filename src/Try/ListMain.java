package Try;

/**
 * @author 1
 */
public class ListMain {
    public static void main(String[] args) {
        String[] str = {"a","b"};
        SinglyList<String> singlyList = new SinglyList<>(str);

        singlyList.clear();
        Node<String> p = singlyList.head.next;
        while (p!=null){
            System.out.println(p.date);
            p=p.next;
        }

        System.out.println(singlyList.search("a"));

    }
}
