import java.util.Arrays;

class lc215KthmaxQuickSort{
    public int findKthLargest(int[] nums, int k){
        quickSort(nums, 0, nums.length-1);
        return nums[nums.length -k];
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
            while(nums[i] < pivot){
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
        quickSort(nums, left, j);
        quickSort(nums, i, right);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        lc215KthmaxQuickSort tester = new lc215KthmaxQuickSort();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = tester.findKthLargest(nums, k);
        System.out.println(res);
    }
}