import java.util.ArrayList;
public class Basicjavatest {
    public static void main(String[] args) {
    Basicjava basicjava = new Basicjava();
    basicjava.printto();
    basicjava.oddprint();
    basicjava.sumodd();
    int [] myArr = {1,3,3,4,7};
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(1);
    list.add(13);
    list.add(2);
    list.add(9);
    basicjava.thru(myArr);
    basicjava.max(myArr);
    basicjava.getAvg(myArr);
    basicjava.oddArr();
    basicjava.howmany(myArr);
    basicjava.square(list);

    }

    
} 