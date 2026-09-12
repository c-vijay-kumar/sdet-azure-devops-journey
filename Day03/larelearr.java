package Day03;

public class larelearr {
    public static void main(String[] args){
        int[] l={1,5,2,6,7};
        int large=0;
        for(int i=0;i<l.length;i++){
            if(l[i]>large){
                large=l[i];
            }
        }
        System.out.println("Largest element in the array: " + large);
    }
}
