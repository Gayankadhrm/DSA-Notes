public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {4,3,1,2,5,8,7,6};
        int temp = 0;
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if (arr[j]<arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }

        System.out.println("----------------------------");

        for(int i=0;i<=n;i++){
            System.out.println(arr[i] + " ");
        }

    
    }
}