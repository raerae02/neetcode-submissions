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
                    if(uniqueRowChars.contains(board[i][j])){
                        return false;
                    } else {
                        uniqueRowChars.add(board[i][j]);
                    }
                    if(squares[squareIndex].contains(board[i][j])){
                        return false;
                    } else {
                        squares[squareIndex].add(board[i][j]);
                    }
                }
                if(board[j][i]!='.'){
                     if(uniqueColoumnChars.contains(board[j][i])){
                        return false;
                    } else {
                        uniqueColoumnChars.add(board[j][i]);
                    }
                }
            }
        }

        return true;
    }
}
