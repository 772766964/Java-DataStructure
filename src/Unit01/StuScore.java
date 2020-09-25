package Unit01;
import java.util.Scanner;

public class StuScore {
    //这里不考虑学号是否重复
    private int stuNum;
    private String name;
    private double score;
    private StuScore Next;

    public  StuScore(int stuNum,String name,double score){
        this.stuNum = stuNum;
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public StuScore getNext() {
        return Next;
    }

    public void setNext(StuScore next) {
        Next = next;
    }
}
