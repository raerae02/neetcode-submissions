class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] squares = new HashSet[9];
        for (int k = 0; k < 9; k++) {
            squares[k] = new HashSet<Character>();
        }

        for(int i = 0; i < board.length; i++){
            HashSet<Character> uniqueRowChars = new HashSet<Character>();
            HashSet<Character> uniqueColoumnChars = new HashSet<Character>();
   
            for(int j = 0; j < board[i].length; j++){
                int squareIndex = (i/3)*3+(j/3);

                if(board[i][j]!='.'){
                   if (!uniqueRowChars.add(board[i][j])) {
                        return false;
                    }
                    if(!squares[squareIndex].add(board[i][j])){
                        return false;
                    }
                }
                if(board[j][i]!='.'){
                     if(!uniqueColoumnChars.add(board[j][i])){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
