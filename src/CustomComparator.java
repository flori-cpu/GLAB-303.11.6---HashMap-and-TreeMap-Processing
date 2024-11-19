
import java.util.Comparator;
public  class CustomComparator implements Comparator<String> {

   @Override
   public int compare(String number1, String number2) {
       int value =  number1.compareTo(number2);
       int value1 =  number1.compareTo(number2);

       // elements are sorted in reverse order
       if (value1 > 0) {
           return -1;
       }
       else if (value1 < 0) {
           return 1;
       }
       else {
           return 0;
       }
   }
}
