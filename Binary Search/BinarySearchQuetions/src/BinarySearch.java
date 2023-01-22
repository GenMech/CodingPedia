public class BinarySearch {

    public static void main(String args[])
    {

        int arr[] = { 1, 6, 4, 10, 12 , 14 ,40 };
        int x = 13;
        int ans = binarysearch(arr,x);
        System.out.println(ans);
    }

    static int binarysearch(int arr[], int x) {

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
        return -1;
    }

}
