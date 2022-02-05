class Looping{
    int j;
    char c;
   public Looping(){
       j=0;
    }
    public Looping(char ch){
        this.c=ch;
    }

    public void ForLoop(){
        for(int i=1;i<=5;i++){
            System.out.println("This is value of i :" + i);
        }
    }
    public void WhileLoop(){
        while(j<10){
            System.out.println(j);
            j++;
        }
    }
    public void DoWhileLoop(){
       do{
            System.out.println(j);
            j++;
        }while(j<2);
    }
    public void SwitchCase(){
        switch(c){
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Fail");
                break;
            default :
                System.out.println("Default Value");
        }
    }
   
}
public class loop {
    public static void main(String[] args) {
        Looping l =new Looping();
        // l.ForLoop();
        // l.DoWhileLoop();
        char ch ='R';
        Looping c=new Looping(ch);
        c.SwitchCase();
    }
}
