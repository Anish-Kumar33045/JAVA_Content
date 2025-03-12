/* 
abstract class Computer
{
    public abstract void code();
    
}


class Laptop extends Computer
{
    public void code()
    {
        System.out.println("coding , compile , run ");
    }
}

class Desktop extends Computer
{
    public void code()
    {
        System.out.println("coding , compile , faster run ");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        // System.out.println("coding...");
        lap.code();
    }
}

class Interface{

    public static void main(String[] args) {

        // Laptop lap = new Laptop();
        // Desktop desk = new Desktop();

        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer anish = new Developer();
        anish.devApp(lap);
        anish.devApp(desk);
        
    }
}

*/

interface  Computer
{
    public abstract void code();
    
}


class Laptop implements  Computer
{
    public void code()
    {
        System.out.println("coding , compile , run ");
    }
}

class Desktop implements  Computer
{
    public void code()
    {
        System.out.println("coding , compile , faster run ");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        // System.out.println("coding...");
        lap.code();
    }
}

class Interface{

    public static void main(String[] args) {

        // Laptop lap = new Laptop();
        // Desktop desk = new Desktop();

        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer anish = new Developer();
        anish.devApp(lap);
        anish.devApp(desk);
        
    }
}





















































