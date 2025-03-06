package lcSort;
import java.util.Arrays;

public class lc912QuickSort{
    public int[] sortArray(int[] nums){
        quickSort(nums, 0, nums.length -1);
        return nums;
    }
    private void quickSort(int[] nums, int left, int right){
        //bc
        if(left >= right){
            return;
        }
        int pivot = nums[left + (right - left)/2];
        int i = left;
        int j = right;
        while(i <= j){
            while(nums[i] < pivot){//都有left right了为啥还要ij呢
                i++;
            }
            while(nums[j] > pivot){
                j--;
            }
            if(i <= j){
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        //出while的时候ij交错过去了
        quickSort(nums, left, j);
        quickSort(nums, i, right);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public static void main(String[] args) {
        lc912QuickSort tester = new lc912QuickSort();
        int[] nums = {5,6,4,3,1,2};
        tester.sortArray(nums);

        System.out.println(Arrays.toString(nums));
    }
}