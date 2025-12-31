class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n = ast.length;
        List<Integer> st = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(ast[i] > 0){
                st.add(ast[i]);
            }
            else{
                while(!st.isEmpty() && st.get(st.size()-1)>0 && st.get(st.size()-1)<Math.abs(ast[i])){
                    st.remove(st.size()-1);
                }
                if(!st.isEmpty() && st.get(st.size()-1) == Math.abs(ast[i])){
                    st.remove(st.size()-1);
                }
                else if(st.isEmpty() || st.get(st.size()-1)<0){
                    st.add(ast[i]);
                }
            }
        }

        int[] res = new int[st.size()];
        for(int i = 0; i < st.size(); i++){
            res[i] = st.get(i);
        }
        return res;
        
    }
}