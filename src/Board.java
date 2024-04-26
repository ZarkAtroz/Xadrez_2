import java.util.ArrayList;

public class Board {
    Piece piece = new Piece(0, 0, ' ', false, false);
    Torre torre = new Torre(0, 0, ' ', false, false);
    Peao peao = new Peao(0, 0, ' ', false, false);
    Cavalo cavalo = new Cavalo(0, 0, ' ', false, false);
    Bispo bispo = new Bispo(0, 0, ' ', false, false);
    Rainha rainha = new Rainha(0, 0, ' ', false, false);
    Rei rei = new Rei(0, 0, ' ', false, false);
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
                    if (piece.getPosX() == i && piece.getPosY() == j) {
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
            if (piece.getPosX() == x && piece.getPosY() == y) {
                System.out.println("Peça encontrada: " + piece.getIcon());
                char icon = piece.getIcon();
                pieceList(pieces, icon, x, y);
                return;
            }
        }
        System.out.println("Nenhuma peça encontrada");
    }

    public void pieceList(ArrayList<Piece> pieces ,char icon, int x, int y) {
        switch (icon) {
            case '♜':
                if (torre.isBlocked(pieces, x, y)) {
                    System.out.println("Torre bloqueada");
                } else {
                    System.out.println("Torre Liberada");
                    //torre.move(icon, x, y);
                }
                break;/*
            case '♞':
                cavalo.move(icon, x, y);
                break;
            case '♝':
                bispo.move(icon, x, y);
                break;
            case '♛':
                rainha.move(icon, x, y);
                break;
            case '♚':
                rei.move(icon, x, y);
                break;
            case '♟':
                peao.move(icon, x, y);
                break;
            case '♖':
                torre.move(icon, x, y);
                break;
            case '♘':
                cavalo.move(icon, x, y);
                break;
            case '♗':
                bispo.move(icon, x, y);
                break;
            case '♕':
                rainha.move(icon, x, y);
                break;
            case '♔':
                rei.move(icon, x, y);
                break;
            case '♙':
                peao.move(icon, x, y);
                break;*/
            default:
                System.out.println("Peça não encontrada");
                break;
        }
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
