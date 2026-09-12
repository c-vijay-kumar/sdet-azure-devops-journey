
package Day03;

public class arr2lar {
    public static void main(String[] args){
        //second largest element in array
        int[] l={1,6,4,2,7,9,8};
        int second_largest_element=0;
        for(int i=0;i<l.length;i++){
            for(int j=i+1;j<l.length;j++){
                if(l[i]>l[j]){
                    int temp=l[i];
                    l[i]=l[j];
                    l[j]=temp;
                }
            }
        }
        second_largest_element=l[l.length-2];
        System.out.println("Second largest element in the array: " + second_largest_element);
    }
    
}
