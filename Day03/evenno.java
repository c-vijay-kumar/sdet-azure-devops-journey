package Day03;

public class evenno {
    public static void main(String[] args){
        int[] n={1,2,3,4,5};
        System.out.print("Even numbers in the array: ");
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                System.out.print(n[i] + " ");
            }
        }
    }
}
