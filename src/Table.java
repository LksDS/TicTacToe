public class Table {
    private char[][] squares = new char[3][3];
    private boolean isSeted;

    public Table() {
        resetTable();
    }

    public void setMarker(Vector vetor, char marker) {
        isSeted = false;
        int x = vetor.getX() - 1;
        int y = vetor.getY() - 1;
        if (squares[x][y] != ' ') {
            isSeted = false;
        } else {
            squares[x][y] = marker;
            isSeted = true;
        }
    }

    public boolean isSeted() {
        return this.isSeted;
    }

    public void resetTable() {
        for (int i = 0; i < 3; i++) {
            for (int e = 0; e < 3; e++) {
                squares[i][e] = ' ';
            }
        }
    }

    public void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int e = 0; e < 3; e++) {
                System.out.printf("[%s] ", squares[e][i]);
            }
            System.out.println();
        }
    }

    public boolean isVictory(Player player) {
        char marker = player.getMarcador();
        return verifyColumns(marker)|| verifyRows(marker)|| verifyDiagonals(marker);
    }

    public boolean verifyRows(char marker) {
        for (int x = 0; x < 3; x++) {
            //Número de marcadores na mesma fileira
            int markers = 0;
            for (int y = 0; y < 3; y++) {
                if (squares[x][y] == marker) {
                    markers += 1;
                }
            }
            if (markers == 3) {
                return true;
            }
        }

        return false;
    }

    public boolean verifyColumns(char marker) {
        for (int y = 0; y < 3; y++) {
            //Número de marcadores na mesma fileira
            int markers = 0;
            for (int x = 0; x < 3; x++) {
                if (squares[x][y] == marker) {
                    markers += 1;
                }
            }
            if (markers == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean verifyDiagonals(char marker) {
        int markers = 0;
        for (int i = 0; i < 3; i++) {
            if (squares[i][i] == marker) {
                markers += 1;
            }
        }
        if (markers == 3)
            return true;
        else {
            markers = 0;
            for (int i = 0; i < 3; i++) {
                if (squares[i][2-i] == marker) {
                    markers += 1;
                }
            }
            return markers == 3;
        }
    }
}
