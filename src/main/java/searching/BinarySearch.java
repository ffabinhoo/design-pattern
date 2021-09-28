package searching;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array, target, 0, array.length-1);
    }

    private static int binarySearchHelper(int[]array, int target, int left, int right){
        if (left > right){
            return -1;
        }

        int mid = (left+right) /2;
        int match = array[mid];

        if (target == match){
            return mid;
        } else if (target > match){
            return binarySearchHelper(array, target, mid+1, right);
        }else{
            return binarySearchHelper(array, target, left, mid-1);
        }

    }
}
