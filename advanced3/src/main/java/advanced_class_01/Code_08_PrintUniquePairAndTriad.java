package advanced_class_01;

public class Code_08_PrintUniquePairAndTriad {

    public static void printUniquePair(int[] arr, int k){

        if(arr == null || arr.length < 2){
            return;
        }
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] < k){
                left++;
            } else if(arr[left] + arr[right] > k){
                right++;
            }else{
                if(left == 0 || arr[left-1] != arr[left]){
                    System.out.println(arr[left] + "," + arr[right]);
                }
                left++;
                right--;
            }
        }
    }
}
