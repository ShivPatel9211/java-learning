abstract class A{
   abstract void show();

}
class B extends A{
    public void show(){
        System.out.println("I am in B show");
    }
    public void display(){
        System.out.println("I am in B dispaly");
    }
}

class AbstractionDemo {
    public static void main(String[] args) {
        // A a= new A();
        B b = new B();
        b.display();
    }
}