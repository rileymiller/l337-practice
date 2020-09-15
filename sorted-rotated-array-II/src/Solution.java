class Solution {
    
    public boolean findValue(int[] nums, int start, int end, int search) {
        
    	if(nums.length == 1) {
    		return nums[0] == search;
    	}
    	
    	
        if (start > end) return false;
        
        
        int mid = (end + start) / 2;
        
        if (nums[mid] == search) {
            return true;
        }
        
        if(nums[start] == nums[mid]) {
        	boolean checkEq = findValue(nums, start, mid -1, search);
        	if(checkEq) {
        		return true;
        	} else {
        		return findValue(nums, mid + 1, end, search);
        	}
        }
        // the left half is sorted
        else if(nums[start] < nums[mid]) {
            if(nums[start] <= search && nums[mid] >= search) {
                return findValue(nums, start, mid - 1, search);
            } else {
                return findValue(nums, mid + 1, end, search);
            }
        } else { // the right half is sorted
            if(nums[mid] <= search && nums[end] >= search) {
                return findValue(nums, mid + 1, end, search);
            } else {
                return findValue(nums, start, mid - 1, search);
            }
        }
        
    }
    
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        return findValue(nums, 0, end, target);
    }
    
    public static void main(String args[]) {
    	int nums1[] = { 2,5,6,0,0,1,2 };
    	Solution s = new Solution();
    	
    	System.out.println(s.search(nums1, 0));
    	System.out.println(s.search(nums1, 3));
    	
    	int nums2[] = { 1, 3, 1, 1, 1 };
    	Solution s2 = new Solution();
    	
    	System.out.println(s2.search(nums2, 3));
    	
    	int nums3[] = { 1 };
    	Solution s3 = new Solution();
    	System.out.println(s3.search(nums3, 1));
    	System.out.println(s3.search(nums3, 3));
    	
    	int nums4[] = { 1, 1 };
    	Solution s4 = new Solution();
    	System.out.println(s4.search(nums4, 1));
    	System.out.println(s4.search(nums4, 3));
    	
    	int nums5[] = { 1, 3};
    	Solution s5 = new Solution();
    	System.out.println(s5.search(nums5, 3));
    	System.out.println(s5.search(nums5, 1));
    }
}