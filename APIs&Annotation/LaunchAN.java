//functional Interface
// @FunctionalInterface
// interface Demo
// {
//     void disp();
//     void set();
// }


//this is parent class
class Plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println("plane is flying");
    }
}

//this is child class
class CargoPlane extends Plane
{
    //overriden method from parent class
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println("cargoplane flies low");
    }
}

public class LaunchAN {
    public static void main(String[] args) {

        Plane cp=new CargoPlane();
        cp.planeFliesAtGoodHeight();
        

    }
}
