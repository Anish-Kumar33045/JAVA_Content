
import java.util.ArrayList;
import java.util.Arrays;

//topic : custom array list 

public class OOPS6a{
  
    private int[] data;
    private static int DEFAULT_SIZE = 3;
    private int size = 0;

    public OOPS6a() {
  this.data = new int [DEFAULT_SIZE];
    }

   public void add(int num){
    if(isFull()){
        resize();
    }
    data[size++] = num;
   }

   private void resize() {
    int [] temp = new int[data.length*2];
    //copy the current element in the new array
    for(int i=0; i< data.length ; i++){
        temp[i]= data[i];
    }
    data = temp;
   }

private boolean isFull() {
       return size == data.length;
   }
   
   public int remove(){
    int removed = data[--size]; // size is also working as index
    return removed;
   }

   public int get(int index){
    return data[index];
   }

    public int size(){
        return size;
    }

    public void set(int index , int value){
        data[index]= value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{"+
                "data= "+Arrays.toString(data)+
                ",size = "+size + "}";
    }
  
    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1,2);
        // list.size();
        // list.isEmpty();
       // the above is the array list and its methods
       // we are trying to create our own methods 

      OOPS6a list = new OOPS6a();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        // when the ArrayList is full then it doubles its size , copies the older element , and add new element to the new Arraylist 


        System.out.println(list);
      // remember the default size that we have created 
    }

      ArrayList<Integer> list2 = new ArrayList<>();
    //    list2.add("string"); //gives error as generic <Integer> specified. so String can't be written
    //    ArrayList<int> list2 = new ArrayList<>(); //primitives can't be added

     
}
//notes