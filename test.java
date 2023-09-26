

class Automobile
 {
    int wheel;

    void printWheel() {
        System.out.println("The number of wheels on bike is " + wheel);
    }
}

    class Bajaj extends Automobile {
        String brand;
        int power;

        void printInfo() {
            System.out.println("The brand of bike is " );
            System.out.println(brand);
            System.out.println("The power of Bike engine is:" + power);

        }
    }

    class Bro extends Bajaj {
        
        int power;

        void printinfo() {
            System.out.println("The power of NS200 is :" + power);
        }
    }


class test2
 {
    public static void main (String args[])
    {
        
     Bro ns = new Bro();
     ns.wheel=2;
     ns.brand="Pulsor";
     ns.power=220;
     ns.printInfo();
     
    }
 }