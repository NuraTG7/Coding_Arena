import java.util.HashMap;
import java.util.Map;

class Node {
    int key, val, cnt;
    Node next, prev;

    Node(int _key, int _val) {
        key = _key;
        val = _val;
        cnt = 1;
    }
}

class DLList {
    Node head, tail;
    int size;

    DLList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    void addFront(Node node) {
        Node temp = head.next;
        node.next = temp;
        node.prev = head;
        head.next = node;
        temp.prev = node;
        size++;
    }

    void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        size--;
    }
}

class LFUCache {
    private Map<Integer, Node> keyNode;
    private Map<Integer, DLList> freqMap;
    private int maxSize, minFreq, curSize;

    public LFUCache(int capacity) {
        maxSize = capacity;
        minFreq = 0;
        curSize = 0;
        keyNode = new HashMap<>();
        freqMap = new HashMap<>();
    }

    private void updateFreqMap(Node node) {
        if (freqMap.containsKey(node.cnt)) {
            freqMap.get(node.cnt).removeNode(node);
        }

        if (node.cnt == minFreq && freqMap.get(node.cnt).size == 0) {
            minFreq++;
        }

        node.cnt++;
        DLList nextHighFreqMap = freqMap.getOrDefault(node.cnt, new DLList());
        nextHighFreqMap.addFront(node);
        freqMap.put(node.cnt, nextHighFreqMap);
        keyNode.put(node.key, node);
    }

    public int get(int key) {
        if (keyNode.containsKey(key)) {
            Node node = keyNode.get(key);
            int val = node.val;
            updateFreqMap(node);
            return val;
        }
        return -1;
    }

    public void put(int key, int val) {
        if (maxSize == 0) return;

        if (keyNode.containsKey(key)) {
            Node node = keyNode.get(key);
            node.val = val;
            updateFreqMap(node);
        } else {
            if (curSize == maxSize) {
                DLList list = freqMap.get(minFreq);
                Node nodeToRemove = list.tail.prev;
                keyNode.remove(nodeToRemove.key);
                list.removeNode(nodeToRemove);
                if (list.size == 0) freqMap.remove(minFreq);
                curSize--;
            }
            curSize++;
            minFreq = 1;
            DLList listFreq = freqMap.getOrDefault(minFreq, new DLList());
            Node node = new Node(key, val);
            listFreq.addFront(node);
            keyNode.put(key, node);
            freqMap.put(minFreq, listFreq);
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

