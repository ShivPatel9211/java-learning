public class array {
    public static void main(String[] args) {
        int a[]= new int[5]; //decelering array of size 5
        int b[]={1,3,5,6,6};
        // System.out.println(a[1]);
        // System.out.println(b[2]);
        // for(int i=0;i<b.length;i++){
        //     System.out.print(b[i]+" ");
        // }

        // for(int k : b){
        //     System.out.print(k +" ");
        // }

        int d[][]=new int[3][3]; //decelering 2D array
        int e[][]={
            {1,2,3},
            {2,3,4,5},
            {3,5,2}
        };

        // for(int i =0;i<e.length;i++){
        //     for(int j=0;j<e[i].length;j++){
        //         System.out.print(e[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(int k[]:e){
            for(int l:k){
                System.out.print(l+" ");
            }
            System.out.println();
        }

    }
}
