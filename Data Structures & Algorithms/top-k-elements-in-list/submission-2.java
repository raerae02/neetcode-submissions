class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                value++;
                map.put(nums[i],value);
            } else {
                map.put(nums[i],1);
            }
        }

        int[] topElements = new int[k];
        
        for(int i = 0; i < topElements.length; i++){
            int currentMax = 0;
            int currentKey = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if(value > currentMax){
                    currentMax = value;
                    currentKey = key;
                }
            }
            topElements[i] = currentKey;
            map.remove(currentKey);
        }
        return topElements;
    }
}
