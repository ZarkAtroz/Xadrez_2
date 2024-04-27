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

    public void color(char peca, int PosX, int PosY, String Letras, String RED, String RESET){
        for (int i = 0; i < 8; i++) {
            System.out.print(i+1 + "   ");
            for (int j = 0; j < 8; j++) {
                if (i == PosX && j == PosY) {
                    System.out.print("[" + peca + "]");
                } else if (i == PosX || j == PosY) {
                    System.out.print(RED + "[ ]" + RESET);
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
        System.out.print(Letras);
    }
}
