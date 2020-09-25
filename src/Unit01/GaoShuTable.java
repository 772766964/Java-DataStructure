package Unit01;

public interface GaoShuTable {
    public void addStu(int stuNum,String name,double score);
    public void delStu(StuScore head , int stuNum);

    public static StuScore FindStuScore(StuScore head , int stuNum){
        int i = 0;
        StuScore stu = head;
        while( stuNum > i && head!=null ){
            i++;
            stu = stu.getNext();
        }
        if(stuNum < 0 || head == null){
            new Exception("错误！");
        }
        return stu;
    }

    public static double FindStuAvg(StuScore head) {
        int count = 0;
        double sum = 0;
        StuScore s = head;
        while(s != null){
            count++;
            sum+=s.getScore();
            s = s.getNext();
        }
        if(count>0 && s != null){
            new Exception("错！");
        }
        return sum/count;
    }

    public static double FindStuId(StuScore head , int stuNum) {
        return FindStuScore(head,stuNum).getScore();
    }

}
