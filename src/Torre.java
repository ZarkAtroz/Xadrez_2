import java.util.ArrayList;

public class Torre extends Piece {
    public Torre(int x, int y, char icon, boolean isWhite, boolean isBlack){
        super(x, y, icon, isWhite, isBlack);
    }

    public boolean isBlocked(ArrayList<Piece> pieces, int x, int y){
        int blocked = 0;
        for(Piece piece : pieces){
            if(piece.getPosX() == x + 1 && piece.getPosY() == y){
                blocked++;
            } else if(piece.getPosX() == x - 1 && piece.getPosY() == y){
                blocked++;
            } else if(piece.getPosX() == x && piece.getPosY() == y + 1){
                blocked++;
            } else if(piece.getPosX() == x && piece.getPosY() == y - 1){
                blocked++;
            }
        }

        if (blocked > 0){
            return true;
        } else {
            return false;
        }
    }
}
