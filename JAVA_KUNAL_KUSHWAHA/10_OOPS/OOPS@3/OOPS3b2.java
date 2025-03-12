class ObjectPrint{

  int num;

  public ObjectPrint(int num){
    this.num=num;
  }
    @Override // this is overriding the actual toString() method 
    public String toString(){
        return "ObjectPrint{ " + "num= " + num + " }";
    }
}

public class OOPS3b2 {
    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj);
        // the obj gets the toString method default //ctrl+click to know more

       
    }
}
//note : every class extends implicitly the object class
 //i.e class ObjectPrint extends Object 
 // the above line need not be mentioned but sets automatically by java
