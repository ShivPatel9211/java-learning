class Cal{
   public Cal(){
System.out.println("in Cal");
    }
    public void add(int i, int j){
        System.out.println("sum :" + (i+j));
    }
}
class Adcal extends Cal{
    public Adcal(){
        System.out.println("in adcal");
    }
    public void diff(int i, int j){
        System.out.println("substraction :"+ (i-j));
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Cal c= new Cal();
        Adcal c=new Adcal();
        // c.add(2, 3);
        // c.diff(3, 1);
    }
    
}
