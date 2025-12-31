import java.util.*;
import java.util.Stack;

class dailyTemp{
    public static void main(String args[]){
        int[] temp = {73,74,75,71,69,72,76,73};
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> st  = new Stack<>();

        for(int i  = n-1; i >= 0; i--){
            while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = 0;
            }
            else{
                ans[i] = st.peek()-i;
            }
            st.push(i);
        }
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}