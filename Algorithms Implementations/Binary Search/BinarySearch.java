public class BinarySearch {

    int search(int[] arr, int l, int r, int num){
        int index=-1;
        if (l<=r) {
            int m = (l+r)/2;
            if(arr[m] == num) return m;
            else if(arr[m] < num) index = search(arr, m+1, r, num);
            else if(arr[m] > num) index = search(arr, l, m-1, num); 
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 19, 36, 41, 67, 99};
        BinarySearch sr = new BinarySearch();
        int index = sr.search(arr, 0, arr.length-1, 69);
        System.out.println(index);
    }
    
}
