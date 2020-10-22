package Try;

/**
 * @author 1
 */
public class ListMain {
    public static void main(String[] args) {
        Integer[] str = {1,2,3};
        Integer[] str1 = {3,5,6};
        SinglyList<Integer> singlyList1 = new SinglyList<Integer>(str);
        SinglyList<Integer> singlyList2 = new SinglyList<Integer>(str1);

        singlyList1.merge(singlyList2);

        /*
         * 输出链表
         */
//        System.out.println(merge);
        Node<Integer> p = singlyList1.head.next;

        while (p!=null){
            System.out.println(p.date);
            p=p.next;
        }
    }
}
