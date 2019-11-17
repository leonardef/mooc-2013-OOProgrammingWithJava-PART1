
public class StringUtils {

    public StringUtils() {
    }
    
    
    
    public static boolean included(String word, String searched) {
        if(word.equals(null) || searched.equals(null)){
            return false;
        }
        
        return word.toUpperCase().contains(searched.trim().toUpperCase());
        
    }
    
}
