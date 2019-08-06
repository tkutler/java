import java.util.ArrayList;

public class Basicjava {
    public void printto() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void oddprint() {
        for (int x = 1; x < 256; x += 2) {
            System.out.println(x);
        }

    }

    public void sumodd() {
        Integer sum = 0;
        for (int y = 0; y < 256; y++) {
            sum += y;
            System.out.println(y);
            System.out.println(sum);

        }
    }

    public void thru(int[] Array) {
        for (int number : Array) {
            System.out.println(number);
        }

    }

    public void max(int[] Array) {
        Integer max = Array[0];
        for (int d = 1; d < Array.length; d++) {
            if (Array[d] > max) {
                max = Array[d];
                System.out.println(max);
            }

        }
    }

    public void getAvg(int[] Array) {
        Integer sum = 0;
        for (int g = 0; g < Array.length; g++) {
            sum += Array[g];
        }
        System.out.println(sum / Array.length);
    }

    public void oddArr() {

        ArrayList<Object> list = new ArrayList<Object>();

        for (int w = 1; w < 256; w += 2) {
            list.add(w);

        }
        System.out.println(list);
    }
    public void howmany(int[] Array){
       Integer count = 0;
        for (int i = 0; i < Array.length; i ++){
            if (Array[i]> 2){
                count ++;
            }
        }
        System.out.println(count);

    }
    public void square(ArrayList<Integer> list ){
        
        for (int i = 0; i < list.size(); i ++){
            Integer x = list.get(i);
            list.set(i, x * x);
            
        }
        System.out.println(list);
    }

}
