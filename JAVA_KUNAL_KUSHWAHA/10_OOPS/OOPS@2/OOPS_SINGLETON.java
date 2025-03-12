class OOPS_SINGLETON {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
    }

    // Singleton class is a class that can create only one object
    public static class Singleton {

        // Private constructor to prevent object creation
        private Singleton() { }

        // Static variable to hold the single instance of the class
        private static Singleton instance;

        // Method to get the instance of the Singleton class
        public static synchronized Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
/*
 *  synchronised --> used to control the access of block of code or method by multiple threads .
 *                   it ensures only one thread can execute a synchronised block or method at a time 
 *                   thereby preventing thread interface and maintaining thread safety .
 *  types --> method and block synchronization .
 */