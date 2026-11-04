class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue <Integer> remainingStones = new PriorityQueue<>((a,b) ->b-a);

        for(int ele : stones){
            remainingStones.offer(ele);
        }
        while(remainingStones.size() > 1){
            int x = remainingStones.poll();
            int y = remainingStones.poll();
            int diff = Math.abs(x-y);
            if(diff != 0){
                remainingStones.offer(diff);
            }
        }
        return remainingStones.size() != 0 ? remainingStones.peek() : 0; 
    }
}
