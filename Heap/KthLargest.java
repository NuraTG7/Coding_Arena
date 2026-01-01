class KthLargest {
    private PriorityQueue<Integer> minheap;
    int size;
    public KthLargest(int k, int[] nums) {
        size = k;
        minheap = new PriorityQueue<>();
        
        for(int num:nums){
            minheap.offer(num);

            if(minheap.size() > k){
                minheap.poll();
            }
        }
    }
    
    public int add(int val) {
        minheap.offer(val);

        if(minheap.size() > size){
            minheap.poll();
        }
        return minheap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */