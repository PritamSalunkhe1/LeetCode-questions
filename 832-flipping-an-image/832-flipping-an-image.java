class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i= 0; i<image.length;i++){
            reverse(image[i]);
            invert(image[i]);
        }
    return image;
    }
    
    static void reverse (int [] arr){
         int start = 0;
        int end = arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void invert (int[] arr){
        for (int i =0; i<arr.length;i++){
            if (arr[i]==0){
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
    }
}