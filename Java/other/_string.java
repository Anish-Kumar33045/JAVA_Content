class _string{
    public static void main(String arg[]){

      String name = new String("Anish"); 

      System.out.println(name.hashCode());
      // we can change the name as 
      name = name + " Kumar";   // we are changing the string by concatenation , the content occupies the new address

      System.out.println("hello "+ name);

      System.out.println(name.hashCode());


    }
}

// mutable string ---> changing
// immutable string ---> unchanging  ( string buffer and string builder)