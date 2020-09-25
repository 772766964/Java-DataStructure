package ListDemo;

public class TestMain {
    public static void main(String[] args) {
        String[] aaa = {"ba","sdf","as"};
        SeqList<String> a = new SeqList<String>(aaa);
        System.out.println(a.insert(1,"rxl"));
    }
}
