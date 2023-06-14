import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String args[]){
        
        ArrayList<Integer> list=new ArrayList<>();

        //add operation
        list.add(2); //O(1)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        
        System.out.println(list);
        Collections.sort(list);  //ascending order
        System.out.println(list);
         
        //Descending order
        Collections.sort(list,Collections.reverseOrder());
        //Comparator -fnx logic
        System.out.println(list);
         

    }
}
