package assignment;

public class StringUtils {

    private String string;

    public StringUtils(String string) {
        this.string = string;
    }

   public int _indexOf(char character){
       int _indexOf = -1;
       for (int i = 0; i < string.length(); i++) {
           if(string.charAt(i) == character){
              return i;
           }
       }
       return _indexOf;
   }


}
