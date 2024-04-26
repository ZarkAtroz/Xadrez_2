import java.util.ArrayList;

public class Torre extends Piece {
    public Torre(int x, int y, char icon, boolean isWhite, boolean isBlack){
        super(x, y, icon, isWhite, isBlack);
    }

    public boolean isBlocked(ArrayList<Piece> pieces, int x, int y){
        for(Piece piece : pieces){
            if(piece.getPosX() == x + 1 && piece.getPosY() == y){
                System.out.println("Existe uma peça bloqueando o caminho.");
                return true;
            }
            if(piece.getPosX() == x - 1 && piece.getPosY() == y){
                System.out.println("Existe uma peça bloqueando o caminho.");
                return true;
            }
            if(piece.getPosX() == x && piece.getPosY() == y + 1){
                System.out.println("Existe uma peça bloqueando o caminho.");
                return true;
            }
            if(piece.getPosX() == x && piece.getPosY() == y - 1){
                System.out.println("Existe uma peça bloqueando o caminho.");
                return true;
            }
        }
        return false;
    }
}
