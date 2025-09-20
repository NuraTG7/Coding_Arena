class searchIn2DSortedMatrix_2{
    public static void main(String[] args){
        int[][] mat = {{10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 29;
        int m = mat.length;
        int n = mat[0].length; 

        int row = 0, col = n-1;

        while(row < n && col >= 0){
            if(mat[row][col] == target){
                System.out.print(row +"  "+col);
                return;
            }
            else if(mat[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }

    }
}

