class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int c = 1;
         int right = matrix[0].length-1,left = 0,bottom = matrix.length-1,top = 0;
        List<Integer>list = new ArrayList<>();
        while(top <= bottom && left <= right){
            for(int i = left;i<=right;i++){
                matrix[top][i] = c++;
            }
            top++;
            for(int j = top;j<=bottom;j++){
                matrix[j][right] = c++;
            }
            right--;

            if(top <= bottom){

            for(int k = right;k>=left;k--){
                matrix[bottom][k] = c++;
            }
            bottom--;
            }

            if(left <= right){
            for(int l = bottom;l >= top;l--){
               matrix[l][left] = c++;
            }
            left++;
            }
        }
        return matrix;
    }
}