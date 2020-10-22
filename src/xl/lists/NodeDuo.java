package xl.lists;

import java.awt.*;

/**
 * @ClassName NodeDuo
 * @Description TODO
 * @Author 1
 * @Date 2020/10/22
 **/
public class NodeDuo {

    public int ex;
    public int value;
    public NodeDuo next;

    public NodeDuo(){
        this(-1,-1,null);
    }
    public NodeDuo( int ex , int value  , NodeDuo next ){
        this.ex = ex;
        this.value = value;
        this.next = next;
    }

//    @Override
//    public String toString() {
//        return this.data.toString();
//    }
}
