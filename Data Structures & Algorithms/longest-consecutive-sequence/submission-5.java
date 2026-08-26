class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length == 0)return 0; 
       Set<Integer> set = new HashSet<>();
       for(int num : nums)set.add(num);
       int maxCount = 1;
       for(int i=0; i<nums.length; i++){
          if(!set.contains(nums[i]-1)){
              int current = nums[i];
              int count = 0;
              while(set.contains(current)){
                 count++;
                 current++;
              }
              maxCount = Math.max(maxCount, count);
          }
       }
       return maxCount;
    }

    /*public int longestConsecutive(int[] nums) {
       if(nums.length == 0)return 0; 
       int count = 1;
       int maxCount = 1;
       Arrays.sort(nums);
       for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i])continue;
            if(nums[i]-nums[i-1] == 1){
                count++;
            }else{
                 count = 1;
            }
            maxCount = Math.max(maxCount, count);
       }   
       return maxCount;
    }*/
}






































