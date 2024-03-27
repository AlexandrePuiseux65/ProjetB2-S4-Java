package module;

public class BackEndGrid {

    // - Variable - //

    private int[][] Grid;
    private boolean status;

    private static final int ROWS = 6;
    private static final int COLS = 7;

    // - Constructor - //

    public BackEndGrid(){}

    public BackEndGrid(int[][] Grid, boolean status){
        this.Grid = Grid;
        this.status = status;
    }

    // - Function - //

    public boolean checkCase (int Colonne, int joueurID) {
        if (Colonne < 0 || Colonne >= COLS) {
            return false;
        }
        for (int i = ROWS - 1; i >= 0; i--) {
            if (Grid[i][Colonne] == 0) {
                Grid[i][Colonne] = joueurID;
                return true;
            }
        }
        return false;
    }

    public int placeCase(int joueurID, int colonne) {
        if (checkCase(joueurID, colonne)) {
            return joueurID;
        } else {
            return 0;
        }
    }


}
