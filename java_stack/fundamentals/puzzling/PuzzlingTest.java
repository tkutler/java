import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzlingTest {
    public static void main(String[] args) {
        Puzzling puzzling = new Puzzling();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(34);
        list.add(13);
        list.add(24);
        list.add(9);
        list.add(9);
        puzzling.first(list);
        ArrayList<String> newlist = new ArrayList<String>();
        newlist.add("Nancy");
        newlist.add("Jinchi");
        newlist.add("Fuji");
        newlist.add("Momochi");
        newlist.add("Isikawa");
        puzzling.second(newlist);
        puzzling.tenrand();
        puzzling.five();


    }
}