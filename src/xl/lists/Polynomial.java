package xl.lists;

/**
 * @ClassName Polynomial
 * @Description TODO
 * @Author 1
 * @Date 2020/10/22
 **/
public class Polynomial {
    /**
     *     多项式 头节点
     */
    public NodeDuo head;

    public Polynomial (){
        head = new NodeDuo();
    }

    public boolean isEmpty() {
        return this.head.next == null;
    }

    public void readPoly(int ex, int value){
        // 找ex
        NodeDuo point = search(ex);
        NodeDuo p = head;
        //没找到ex
        if(point == null){
            while ( p.next != null){
                p=p.next;
            }
            // 找到ex
        } else {
            point.value += value;
        }
        if(p.next == null ){
            p.next = new NodeDuo(ex,value,null);
            p.next.value = value;
        }
    }

    public void delPoly(int ex , int value){
        // 找ex
        NodeDuo point = search(ex);
        if(point==null){
            System.out.println("无这个多变项");
        }else{
            //不等于就可以做加减法
            if(point.value != value){
                point.value -= value;
            }else{
                //==就需要删除
                NodeDuo p = head.next;
                NodeDuo front = head;
                while (p.next!=null && p.ex!=ex){
                    front = front.next;
                    p = p.next;
                }
                front.next=p.next;
            }
        }
    }

    public NodeDuo search(int ex){
        NodeDuo p = head;
        while ( p != null && p.ex != ex){
            p = p.next;
        }
        return p;
    }

    public void print(){
        NodeDuo p = head.next;
        StringBuffer stringBuffer = new StringBuffer();
        while ( p != null){
            if( p.ex == 0 ){
                stringBuffer.append(p.value);
            } else {
                stringBuffer.append(p.value).append("X^").append(p.ex);
            }
            if(p.next!=null){
                stringBuffer.append("+");
            }
            p = p.next;
        }
        System.out.println(stringBuffer);
    }

}
