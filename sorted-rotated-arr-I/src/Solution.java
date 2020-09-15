public class Solution {
    public int findInt(int[] nums, int start, int end, int target) {
        if(end >= 1) {
            int mid = (start + end) / 2;
            if(start > end) return -1; 
            if(nums[mid] == target) {
                return mid;
            }
            
            if(nums[start] <= nums[mid]) { //left tree sorted
                if (target >= nums[start] && target < nums[mid]) {
                    return findInt(nums, start, mid - 1, target);
                } else {
                    return findInt(nums, mid + 1, end, target);
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    return findInt(nums, mid + 1, end, target);
                } else {
                    return findInt(nums, start, mid - 1, target);
                }
            }
        }
        
        if(nums[0] == target) return end;
        return -1;
    }
    
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        return findInt(nums, start, end, target);
    }
    
    
    public static void main(String args[]) {
//    	int[] nums = { 4,5,6,7,0,1,2 };
//    	Solution s = new Solution();
//    	
//    	System.out.println(s.search(nums, 3));
    	
//    	int[] nums1 = { 1 };
//    	Solution s1 = new Solution();
//    	
//    	System.out.println(s1.search(nums1, 1));
    	
    	int[] nums2 = { 3, 1 };
    	Solution s2 = new Solution();
    	
    	System.out.println(s2.search(nums2, 1));
    }
}