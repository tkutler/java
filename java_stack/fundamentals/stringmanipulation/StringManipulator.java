public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        // string1.trim();
        // string2.trim();
        String string3 = string1.trim().concat(string2.trim());
        // string3.trim();
        return string3;
    }
    public Integer getIndexOrNull(String string, char character) {
        int a = string.indexOf(character); 
        if (a < 0){
            return null;
        }
        else {
            return a;
        }

    }
}