import java.util.ArrayList;
public class Operation {
    public static void main(String args[]){
        //Java Collection Framework
        // ClassName objectName =new ClassName();
        ArrayList<Integer> list=new ArrayList<>();
        //ArrayList<String> list1=new ArrayList<>();
        //ArrayList<Boolean> list2=new ArrayList<>();
       
        //add operation
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get operation
        int element = list.get(2); //O(1)
        System.out.println(element);

        //Delete O(n)
        //list.remove(2);
        //System.out.println(list);

        //Set
        list.set(2,10);
        System.out.println(list);
       
        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        list.add(1,9); //O(n)
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();



      }
}
