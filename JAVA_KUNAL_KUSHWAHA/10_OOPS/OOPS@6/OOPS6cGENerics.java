        
import java.util.Arrays;
import java.util.List;

// here T should be Number or its subclasses
public class OOPS6cGENerics<T extends Number>{
  
    private Object[] data;
    private static int DEFAULT_SIZE = 3;
        
        private int size = 0;
    
        public OOPS6cGENerics() {
    //   data = new int T[DEFAULT_SIZE]; // gives error so use OBJECT type instead
        data = new  Object[DEFAULT_SIZE];    
    }
    
       public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
       }
    
       private void resize() {
         Object[] temp = new Object[data.length*2];
        //copy the current element in the new array
        for(int i=0; i< data.length ; i++){
            temp[i]= data[i];
        }
        data = temp;
       }
    
    private boolean isFull() {
           return size == data.length;
       }
       
       public T remove(){
        T removed = (T)(data[--size]); //type casting 
         // size is also working as index
        return removed;
       }
    
       public T get(int index){
        return (T)data[index];
       }
    
        public int size(){
            return size;
        }
    
        public void set(int index , T value){
            data[index]= value; //no cating required
        }
    
        @Override
        public String toString(){
            return "CustomArrayList{"+
                    "data= "+Arrays.toString(data)+
                    ",size = "+size + "}";
        }
      
         public void getList(List<? extends Number> list){
            //do something

            // here you can only pass the number type 
            //List<? extends Number> after this we can 
         }   

        public static void main(String[] args) {
        
    
        
            // when the ArrayList is full then it doubles its size , copies the older element , and add new element to the new Arraylist 
    
    
            // remember the default size that we have created 
            // Integers ,float and so on are subclasses of Number
            OOPS6cGENerics<Number> list3 = new OOPS6cGENerics<>();
            list3.add(45);
            list3.add(56.0);
            list3.add(58);
            list3.add(50);
            System.out.println(list3);
        

    }
}