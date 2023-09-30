class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        List<Integer> ans = new ArrayList<>();

        while ( startRow <= endRow && startCol <= endCol ){

            //top side
            for ( int j = startCol; j <= endCol; j++ ){
                //System.out.println(matrix[startRow][j] + " ");
                ans.add(matrix[startRow][j]);
            }

            //right side
            for ( int i = startRow + 1; i <= endRow; i++){
                // System.out.println(matrix[i][endCol] + " ");
                ans.add(matrix[i][endCol]);
            }

            //bottom side
            for ( int j = endCol - 1; j >= startCol; j--){
                if ( startRow == endRow ){
                    break;
                }
                // System.out.println(matrix[endRow][j] + " ");
                ans.add(matrix[endRow][j]);
            }

            //left side
            for ( int i = endRow - 1; i >= startRow + 1 ; i--){
                if ( startCol == endCol ) {
                    break;
                }
                // System.out.println(matrix[i][startCol] + " ");
                ans.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
}
