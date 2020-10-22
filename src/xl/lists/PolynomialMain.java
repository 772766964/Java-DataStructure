package xl.lists;

/**
 * @ClassName PolynomialMain
 * @Description TODO
 * @Author 1
 * @Date 2020/10/22
 **/
public class PolynomialMain {
    public static void main(String[] args) {
        Polynomial polynomial = new Polynomial();

//        NodeDuo p = polynomial.head;
//        p.next = new NodeDuo(0,1,null);
//        p.next.next = new NodeDuo(0,3,null);
//        System.out.println(polynomial.search(0));
//        polynomial.print();

        polynomial.readPoly(0,2);
        polynomial.readPoly(0,3);
        polynomial.readPoly(3,2);
        polynomial.readPoly(6,2);
        polynomial.readPoly(2,2);
        polynomial.readPoly(1,2);
        polynomial.print();
        polynomial.delPoly(3,2);
        polynomial.delPoly(3,2);
        polynomial.delPoly(0,2);
        polynomial.print();
    }
}
