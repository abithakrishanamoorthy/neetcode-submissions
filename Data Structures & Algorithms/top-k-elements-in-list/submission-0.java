class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
         HashMap<Integer , Integer > map = new HashMap<>();
         for(int i = 0;i< nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , 1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
         
         }
          int[] result = new int[k];

        // Step 2: Find highest frequency k times
        for (int i = 0; i < k; i++) {

            int maxFrequency = 0;
            int maxElement = 0;

            for (int num : map.keySet()) {

                if (map.get(num) > maxFrequency) {
                    maxFrequency = map.get(num);
                    maxElement = num;
                }
            }

            result[i] = maxElement;

            // Remove selected element
            map.remove(maxElement);
        }
       return result;
    }
}
