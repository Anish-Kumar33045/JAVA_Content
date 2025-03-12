
class A{

    int num;

   @Override
   public int hashCode(){
    return super.hashCode();
    //  return num;
   }
   
   @Override
   public boolean equals(Object obj){
    // return super.equals(obj);
    return this.num == ((A)obj).num;//downcasting
   }

   @Override
   protected Object clone ()throws CloneNotSupportedException{
    return super.clone();
   }

   @Override
   public String toString(){
    return super.toString();
   }
//    @Override
//    protected void finalize() throws Throwable{
//     super.finalize();
//    }

   public A(int num){
       this.num = num;
   }
   public A(int num,float gpa){
    this.num = num;
} 
}


public class OOPS4bPackages {
    public static void main(String[] args) {
     A obj = new A(34);
     A obj2 = new A(34);
     A obj3 = obj2;
    //  System.out.println("obj hashcode : "+obj.hashCode());
    //  System.out.println("obj2 hashcode : "+obj2.hashCode());
    //  System.out.println("obj3 hashcode : "+obj3.hashCode());

     A obj4 = new A(34,56.86f);
     A obj5 = new A(12,78.86f);

      if (obj4 == obj5){
        // == is comparator -> checks whether the object is pointing to same object
        System.out.println("obj4 is less than obj5");
      }
      if (obj4.equals(obj5)){
        System.out.println("obj4 is less than obj5");
      }

    //    System.out.println(obj instanceof A);
    //    System.out.println(obj instanceof Object);
       
       System.out.println(obj.getClass());
       // to get data use dot operator i.e getClass.(options available in suggestions)
       // getClass() is final and we can't override 

       
     



    }
     
      
    
     
}
