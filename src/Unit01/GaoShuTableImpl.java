package Unit01;

public class GaoShuTableImpl implements GaoShuTable {

    @Override
    public void addStu(int stuNum, String name, double score) {
        //
//        return new StuScore(stuNum,name,score);
    }

    @Override
    public void delStu(StuScore head , int stuNum) {
        StuScore s = GaoShuTable.FindStuScore(head,stuNum);
        //此时应该找到了


    }
}
