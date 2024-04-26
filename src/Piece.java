import java.util.ArrayList;

public class Piece {
    private int PosX;
    private int Posy;
    private char icon;
    private boolean isWhite;
    private boolean isBlack;

    public Piece(int x, int y, char icon, boolean isWhite, boolean isBlack) {
        this.PosX = x;
        this.Posy = y;
        this.icon = icon;
        this.isWhite = isWhite;
        this.isBlack = isBlack;
    }

    public int getPosX() {
        return PosX;
    }

    public void setPosX(int PosX) {
        this.PosX = PosX;
    }

    public int getPosY() {
        return Posy;
    }

    public void setPosY(int Posy) {
        this.Posy = Posy;
    }

    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }

    public boolean isIsWhite() {
        return isWhite;
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isIsBlack() {
        return isBlack;
    }

    public void setIsBlack(boolean isBlack) {
        this.isBlack = isBlack;
    }


}
