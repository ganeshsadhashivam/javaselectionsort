import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int []arr = {-5,2,1,4,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in tbe remaining array and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);

            swapp(arr,maxIndex,last);
        }
    }
    private  static int getMaxIndex(int[] arr,int start,int end){
    int max = start;

    for(int i=start;i<=end;i++){
        if(arr[max]<arr[i]){
            max = i;
        }
    }

    return max;
    }


    static void swapp(int []arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;



    }


    static void bubble(int [] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped = false;
            //for each step max item will come at the last respective index
            for(int j=1;j<arr.length-1;j++){
                //swap if the item is smaller than the previous item

                if(arr[j] <arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

                //if swapper true
                if(!swapped){
                    break;
                }
            }
        }

    }


}