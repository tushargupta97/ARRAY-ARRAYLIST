import java.util.ArrayList;
public class PairSum_I { //bruteforce O(n^2)
    /*public static boolean pairSum(ArrayList <Integer>list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }*/

    public static boolean pairSum(ArrayList <Integer>list, int target){ //2pointer approach O(n)
        int lp=0,rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false; 
    }
    public static boolean pairSum2(ArrayList <Integer>list, int target){ //O(n)
        int bp=-1;//breaking point
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1; //left pointer
        int rp=bp; //right pointer
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%list.size();
            }
            else{
                rp=(list.size()+rp-1)%list.size();
            }
        }
        return false;

    }
    


    public static void main(String args[]){
       ArrayList<Integer>list =new ArrayList<>();
       list.add(11);
       list.add(15);
       list.add(6);
       list.add(8);
       list.add(9);
       list.add(10);
       int target =16;

       System.out.println(pairSum2(list,target));

    }
}
