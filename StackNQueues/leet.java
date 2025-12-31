class leet{
    public static void main(String[] args) {
        int n = 20;

        int i = 0, cnt = 0, tot = 0;

        while(i < n){
            for(int day = i+1; day <= 7+i; day++){
                if(cnt == n){
                    break;
                }
                tot += day;
                System.out.println(day);
                cnt ++;
            }
            if(cnt == n){
                break;
            }
            i ++;
        }
        System.out.println(tot);
    }
}