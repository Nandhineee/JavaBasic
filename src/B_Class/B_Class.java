package B_Class;

public class B_Class {
    public static void main(String[] args)
    {
        B_Class obj = new B_Class();
        obj.run();
        obj.running();

        Two objOne = new Two();
        objOne.testing();

        Dummy objTwo = new Dummy();
        objTwo.dummy();


    }

    void run(){
        System.out.println("hello world");
    }

    void running(){
        System.out.println("hello");
    }

}

class Two {
    void testing(){
        System.out.println("world");
    }
}


