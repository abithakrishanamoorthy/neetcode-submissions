

class Solution {
    public int longestConsecutive(int[] nums) {

        // Step 1: Create HashSet
        Set<Integer> set = new HashSet<>();

        // Step 2: Add array elements (duplicates removed)
        for (int num : nums) {
            set.add(num);
        }

        int maxcount = 0;

        // Step 3: Check each number
        for (int num : set) {

            // Step 4: Start only if previous number is absent
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Step 5: Check next consecutive numbers
                while (set.contains(current + 1)) {

                    current++;

                    count++;
                }

                // Step 6: Find maximum count
                if (count > maxcount) {
                    maxcount = count;
                }
            }
        }

        // Step 7: Return answer
        return maxcount;
    }
}
    