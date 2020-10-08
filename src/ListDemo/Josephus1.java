package ListDemo;

public class Josephus1 {
    public Josephus1(int n,int start,int distance) throws IllegalAccessException {
        if(n<0||start<0||start>=n||distance<=0||distance>=n)
            throw new IllegalAccessException("n="+n+",start="+start+",distance="+distance);
        System.out.println("Josephus("+n+","+start+","+distance+"),");
        SeqList<String> list= new SeqList<String>(n);
        for (int i = 0; i < n; i++) {
            list.insert((char)('A'+i)+"");
        }
        System.out.println(list.toString());
        while (n>1){
            start=(start+distance-1)%n;
            System.out.println("删除"+list.remove(start).toString()+", "+list.toString());
            n--;
        }
        System.out.println("被赦免者是"+list.get(0).toString());
    }

    public static void main(String[] args) throws IllegalAccessException {
        new Josephus1(5,1,3);
    }
}
