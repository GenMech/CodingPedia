public class IfInfiniteArray {

    public static void main(String args[])
    {

        int[] arr = { 2, 3, 4, 10, 12 , 14 ,40, 56, 57, 81, 92, 100, 102, 104 };
        int x = 56;
        // done
        System.out.println(ans(arr,x));
    }

    static int ans(int[] arr, int x){
      int  start = 0;
      int  end = 1;

      //condition for the target to lie in range

      if( x > arr[end] ){
        int NewStart = end + 1;

        //double the box value
        //end = previous end + (size of box)*2

        end = end + (end - start + 1)*2;
        start = NewStart;
      }
           return infinitearray(arr, x, start, end);
    }



    static int infinitearray(int[] arr, int x, int start, int end) {

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
