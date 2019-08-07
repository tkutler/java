import java.util.HashMap;
import java.util.Set;

public class Hashmaptest{
    public static void main(String[] args){
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Lets go", "if you want it you can get it let me knw");
        tracklist.put("yeah", "next thing i knew she was");
        tracklist.put("fight", "it on its on yah yah");
        tracklist.put("I", "dont wanna waste your time");

        // get the keys by using the keySet method
        Set<String> keys = tracklist.keySet();
        System.out.println(tracklist.get("yeah"));

        for (String key: keys){
            System.out.println(key + ":" + tracklist.get(key));
        }
    }
}