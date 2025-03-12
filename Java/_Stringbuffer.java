class _Stringbuffer{

public static void main(String arg[]){
// StringBuffer sb = new StringBuffer(" Anish ");
// System.out.println(sb.capacity());


//the capacity changes
// StringBuffer sb1 = new StringBuffer("Anish Kumar");
// System.out.println(sb1.capacity());

// sb.append(" Kumar ");
// System.out.println(sb);

// sb.deleteCharAt(2); // deletes the element in particular index
// System.out.println(sb);

//  sb.insert(0, "java");  // sb.insert(index-no , "string ");
//  System.out.println(sb);

//  System.out.println();

  
 /*
 sb.setLength(30);  set the length of string .
 if the string is less it replaces the place with the null characters
 if the string is large it removes the extras beyond the limit
  */
 StringBuffer sb1 = new StringBuffer("hello this the long string with the many characters");
 sb1.setLength(50); 
 System.out.println(sb1);
 sb1.ensureCapacity(100);


}

}

/*
String buffer --> thread safe   ( used in multiple threads )
String builders --> not thread safe ( single threaded environment)  but it is faster than above .

 */