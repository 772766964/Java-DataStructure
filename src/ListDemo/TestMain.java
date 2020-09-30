package ListDemo;

public class TestMain {
    public static void main(String[] args) {
        String[] aaa = {"ba","sdf","as"};
        SeqList<String> a = new SeqList<String>(aaa);
//        System.out.println(a.insert(1,"rxl"));
//        a.remove(1);
//        System.out.println(a.search("as"));
//        a.set(0,"sss");
//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//        }


        String str = new String("abc");
        String str1 = "abc";
        System.out.println(str == str1);//比较内存地址
        System.out.println(str.equals(str1));//比较
    }
}
