public static void checkWinner(int x, int y) {
        board[x][y] = value;
        if (value == 1) {
            value = 2;
        }
        else if (value == 2) {
            value = 1;
        }
        
        int vertsum = 0;
        boolean vincomplete = false;
        for (int i=0; i<board[0].length; i++) {
            vertsum += board[x][i];
            if (board[x][i] == 0) {
                vincomplete = true;
                break;
            }
        }
        if (vincomplete) {}
        else if (vertsum == 3) {
            gameEnd = 1;
        }
        else if (vertsum == 6) {
            gameEnd = 2;
        }

        int horsum = 0;
        boolean hincomplete = false;
        for (int i=0; i<board[0].length; i++) {
            horsum += board[i][y];
            if (board[i][y] == 0) {
                hincomplete = true;
                break;
            }
        }
        if (hincomplete) {}
        else if (horsum == 3) {
            gameEnd = 1;
        }
        else if (horsum == 6) {
            gameEnd = 2;
        }

        int diagsum = 0;
        int odiagsum = 0;
        boolean dincomplete = false;
        boolean odincomplete = false;
        if (Math.abs(x) == Math.abs(y)) {
            for(int i = 0; i<board[0].length; i++) {
                diagsum += board[i][i];
                odiagsum += board[board[0].length-i][i];
                if (board[i][i] == 0) {
                    dincomplete = true;
                    break;
                }
                if (board[board[0].length-i][i] == 0) {
                    odincomplete = true;
                    break;
                }
            }
            System.out.print(diagsum);
            System.out.println(odiagsum);
            if (dincomplete) {}
            else if (diagsum == 3)
            {
                gameEnd = 1;
            }
            else if (diagsum == 6)
            {
                gameEnd = 2;
            }
            if (dincomplete) {}
            else if (odiagsum == 3)
            {
                gameEnd = 1;
            }
            else if (odiagsum == 6)
            {
                gameEnd = 2;
            }
        }
    }
