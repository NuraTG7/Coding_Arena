class Solution {
    public int[] findNSE(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty()?st.peek():n;
            st.push(i);
        }
        return res;
    }

    public int[] findNGE(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty()?st.peek():n;
            st.push(i);
        }
        return res;
    }

    public int[] findPSEE(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty()?st.peek():-1;
            st.push(i);
        }
        return res;
    }

    public int[] findPGEE(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            res[i] = !st.isEmpty()?st.peek():-1;
            st.push(i);
        }
        return res;
    }

    public long subSumMin(int[] arr){
        int n = arr.length;
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);

        long sum = 0;

        for(int i = 0; i<arr.length; i++){
            int left = i-psee[i];
            int right = nse[i]-i;
            long freq = left * right * 1L;
            sum += freq*arr[i];
        }
        return sum;
    }

    public long subSumMax(int[] arr){
        int n = arr.length;
        int[] nge = findNGE(arr);
        int[] pgee = findPGEE(arr);

        long sum = 0;

        for(int i = 0; i<arr.length; i++){
            int left = i-pgee[i];
            int right = nge[i]-i;
            long freq = left * right * 1L;
            sum += freq*arr[i];
        }
        return sum;
    }

    public long subArrayRanges(int[] arr) {
        return subSumMax(arr)-subSumMin(arr);
    }
}