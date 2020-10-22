package week7;

import ListDemo.SeqList;

/**
 * @author 1
 */
public class Operators {
    private String[] operator = {"*", "/", "%", "+", "-", "&", "^", "|"};
    private int[] priority = {3, 3, 3, 4, 4, 8, 9, 10};
    private SeqList<String> operlist;

    public Operators() {
        this.operlist = new SeqList<String>(this.operator);
    }

    public int compare(String oper1, String oper2) {
        int i = operlist.search(oper1), j = operlist.search(oper2);
        return this.priority[i] - this.priority[j];
    }
    public int operate(int x,int y,String oper)
    {
        int value = 0;
        switch (oper)
        {
            case "+":value=x+y;break;
            case "-":value=x-y;break;
            case "*":value=x*y;break;
            case "/":value=x/y;break;
            case "%":value=x%y;break;
            case "^":value=x^y;break;
            case "&":value=x&y;break;
            case "|":value=x|y;break;
            default:break;
        }
        return value;
    }
}
