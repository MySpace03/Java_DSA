package DSA.Array;

public class reversearray {
    public static void reverse(int[] arr){
        int start = 0,end=arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int num[] = {2,4,6,8,10};
        reverse(num);
    }
}
