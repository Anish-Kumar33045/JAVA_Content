public class D_Performance {
    public static void main(String[] args) {
        String series ="";
        
        for(int i=0; i<26 ; i++){
            char ch = (char)('a'+i); // int value 'a'+i is converted to char value by typecasting
            // System.out.println(ch);
            series += ch;
            // System.out.println(series); //  run following code each item a string results which is added by one
            // lot of memory is allocated each item of loop 
        }

        // System.out.println(series);
       
        StringBuilder builder = new StringBuilder();

        for(int i=0; i< 26; i++){
           char cH = (char)('a'+i);
            builder.append(cH);
        }
        //   System.out.println(builder);
          System.out.println(builder.toString());
    }
}
