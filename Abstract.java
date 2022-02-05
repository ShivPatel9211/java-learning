// class A{
//     int roll;
//     String name;
//     static String CEO;
//     static{
//         CEO="Shiv";
//     }
//     public void show(){
//         System.out.println("roll : " +roll + " name :"+name+" CSO: "+ CEO);
//     }
// }

class A{
    public void show(){
        System.out.println("I am in A");
    }
    public void display(){
        System.out.println("I am in display in A");
    }
}

class B extends A
{
    public void show(){
        super.show();
        System.out.println("I am in B");
    }
    // public void display(){
    //     System.out.println("I am in display B");
    // }
}



public class Abstract{
    public static void main(String[] args) {
        // A a =new A();
        // a.roll=12;
        // a.name="Ram";
        // A b=new A();
        // b.roll=20;
        // b.name="Shiv";
        // a.show();
        // b.show();
        A b=new B();
        b.display();
        
    }
}
