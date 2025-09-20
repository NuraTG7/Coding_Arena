class allocate_books{
    public static int countStudents(int[] arr, int pages){
        int students = 1, pagesStudent = 0;
        for(int i = 0; i< arr.length; i++){
            if(pagesStudent + arr[i] <= pages){
                pagesStudent += arr[i];
            }
            else{
                pagesStudent = arr[i];
                students++;
            }
        }
        return students;
    }

    public static void main(String[] args){
        int n = 4, m = 3;
        int[] arr = {12, 34, 67, 90};

        if(m > n) System.out.println(-1);
        int low = 0, high = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] > low) low = arr[i];
            high += arr[i];
        }

        // System.out.println(high);
        while(low <= high){
            int mid = (low + high)/2;
            int students = countStudents(arr, mid);
            
            if(students > m){
                low = mid + 1;
            }
            else{ 
                high = mid - 1;
            }
        }
        System.out.println(low);
    }
}