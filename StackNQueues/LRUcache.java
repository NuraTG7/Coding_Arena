class LRUCache {

    Node head = new Node(0,0), tail = new Node(0,0);
    Map<Integer, Node> mpp = new HashMap();
    int capacity = 0;

    class Node{
        Node prev, next;
        int key, val;
        Node(int _key, int _val){
            key = _key;
            val = _val;
        }
    }

    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(mpp.containsKey(key)){
            Node node = mpp.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            remove(mpp.get(key));
        }
        if(mpp.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    public void insert(Node node){
        mpp.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void remove(Node node){
        mpp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */