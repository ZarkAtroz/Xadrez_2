import java.util.ArrayList;

public class Board {
    Piece piece = new Piece(0, 0, ' ', false, false);
    public  static  final String Letras = "            A           B          C           D          E          F           G           H\n";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLUE = "\u001B[34m";

    private final String[][] board = new String[8][8];


    public void printBoardPieces(ArrayList<Piece> pieces) {
        for (int i = 0; i < 8; i++) {
            System.out.print(i+1 + "   ");
            for (int j = 0; j < 8; j++) {
                boolean hasPiece = false;
                for (Piece piece : pieces) {
                    if (piece.getPosX() == i && piece.getPosy() == j) {
                        System.out.print("[" + piece.getIcon() + "]");
                        hasPiece = true;
                        break;
                    }
                }
                if (!hasPiece) {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
        System.out.print(Letras);

    }

    public void findPiece(ArrayList<Piece> pieces, int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getPosX() == x && piece.getPosy() == y) {
                System.out.println("Peça encontrada: " + piece.getIcon());
                return;
            }
        }
        System.out.println("Nenhuma peça encontrada");
    }




}

/*public void blockedPiece(ArrayList<Piece> pieces, int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getPosX() == x + 1 && piece.getPosy() == y) {
                System.out.println("Peça esta bloqueada por : " + piece.getIcon());
                return;
            }
        }
        System.out.println("Nenhuma peça bloqueada");
    }*/
