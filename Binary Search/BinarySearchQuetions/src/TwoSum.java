import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        Arrays.sort(arr);
        int target = 5;

        if(helper(arr, target)){
            System.out.println("Yess");
        }else System.out.println("NO");
    }

    public static boolean helper(int[] arr, int target){
        int low  = 0;
        int high = arr.length - 1;
        while(low < high){
            if(arr[low] + arr[high] == target){
                return true;
            }else if(arr[low] + arr[high] > target){
                high--;
            }else low ++;
        }
        return false;
    }
}
