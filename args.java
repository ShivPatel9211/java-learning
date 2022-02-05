class Add {
    int sum1=0;
    public int sum(int ... n){
        for(int k :n){
            sum1=sum1+k;
        }
        return sum1;
    }
    public void show(){
        System.out.println("hello world");
    }
}
public class args {
    public static void main(String[] args) {
        Add a=new Add();
        // a.show();
        System.out.println(a.sum(1,3,3));  
    }
}

