import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzling {
    public void first(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
            if (list.get(i) > 10){
                newList.add(list.get(i));

            }
            
        }
        System.out.println(newList);
        System.out.println(sum);

    }
    public void second (ArrayList<String> list){
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public void tenrand(){
        Random r = new Random();
        for (int i = 0; i < 10;i++){
        System.out.println(r.nextInt(100-55)+55);
        }
    }
    public void five(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10;i++){
            list.add(r.nextInt(100-55)+55);
            Collections.sort(list);
        }
        System.out.println(list);
        Integer max = list.get(0);
        Integer min = list.get(0);
        for (int y = 1; y < list.size(); y++){
            if (list.get(y) > max){
                max = list.get(y);
            }
            if (list.get(y)< min){
                 min = list.get(y);
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
    public void six(){
        
    }

    
}