import java.util.Arrays;

public class binary-search{

    public static boolean hasDuplicate(int[] arr, int low, int high){
        if (low>=high){
            return false;
        }

        int mid = (low+high) / 2;

        if(arr[mid-1]==arr[mid] || arr[mid+1]==arr[mid]){
            return true;
        }

        boolean leftResult = hasDuplicate(arr, low, mid - 1);
        boolean rightResult = hasDuplicate(arr, mid + 1, high);


        return leftResult || rightResult;
    }
    public static void main(String[] args) 
    { 
        int[] myNum= {1,2,3,4,4,5,6,7,8};
        boolean ans= hasDuplicate(myNum,0,myNum.length-1);

        System.out.println(ans);




 }
}

