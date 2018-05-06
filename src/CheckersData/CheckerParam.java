package CheckersData;

import javafx.scene.paint.Color;

public class CheckerParam {

    private final double WIDTH = 80;
    private final double HEIGTH = 80;
    private final Color WHITE_CHECKER = Color.WHITE;
    private final Color BLACK_CHECKER = Color.BLACK;
    private final Color CHECKER_STATUS = Color.BLUE;

    public double getHEIGTH() {
        return HEIGTH;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    public Color getWHITE_CHECKER() {
        return WHITE_CHECKER;
    }

    public Color getBLACK_CHECKER() {
        return BLACK_CHECKER;
    }

    public Color getCHECKER_STATUS() {
        return CHECKER_STATUS;
    }
}
