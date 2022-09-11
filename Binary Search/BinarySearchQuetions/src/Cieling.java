public class Cieling {

    public static void main(String args[])
    {

        int arr[] = { 2, 3, 4, 10, 12 , 14 ,40 };
        int x = 13;
        int ans = cieling(arr,x);
        System.out.println(ans);
    }

    static int cieling(int arr[], int x) {

        //what is the target is greater that greatest element present in array
        if (x>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (x < arr[mid]) {
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
