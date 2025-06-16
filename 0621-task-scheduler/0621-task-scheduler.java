class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int sum = 0;
        for(char c: tasks){
            map.put(c, map.getOrDefault(c, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(c));
        }
        int maxFreqTasks = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == maxFreq) maxFreqTasks++;
        }
        
        sum = (maxFreq-1) * (n+1) + (maxFreqTasks);
        return Math.max(tasks.length, sum);
    }
}