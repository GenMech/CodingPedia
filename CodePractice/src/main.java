public class main {
    // printing subarray of array
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        int n = arr.length;
        printSubarray(arr, n);
    }
    static void printSubarray(int[] arr, int n){
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                printArray(arr, start, end);
            }
        }
    }
    static void printArray(int[] arr, int start, int end){
        System.out.print("{");
        for (int i = start; i <= end; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println(("}"));
    }
}
