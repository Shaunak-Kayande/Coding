import java.util.Arrays;
public class Sort012 {

    static void sort(int a[], int n){
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(a[mid] == 0){
                swap(a, mid, low);
                low++;
                mid++;
            }
            else if(a[mid] == 1){
                mid++;
            }
            else if(a[mid] == 2){
                swap(a, mid, high);
                high--;
            }
        }
    }

    static void swap(int a[], int x, int y){
        int temp = 0;
        temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }


    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sort(arr, arr.length);
        System.out.println("Array after seggregation:\n " + Arrays.toString(arr));
        
    }
}
