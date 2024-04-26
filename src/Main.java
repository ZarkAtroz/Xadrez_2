import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

//White pieces
//"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"
//"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"

//Black pieces
//"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"
//"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"

public class Main {

    public static int LOOP = 0;
    public static int[] convertCoordinates(String input) {
        int[] coordinates = new int[2];

        coordinates[0] = Integer.parseInt(input.substring(0, 1)) - 1;
        coordinates[1] = Character.toUpperCase(input.charAt(1)) - 'A';

        return coordinates;
    }

    public static void addPieces(ArrayList<Piece> Pieces){
        //White pieces
        Pieces.add(new Torre(3, 0, '♜', true, false));
        Pieces.add(new Cavalo(0, 1, '♞', true, false));
        Pieces.add(new Bispo(0, 2, '♝', true, false));
        Pieces.add(new Rainha(0, 3, '♛', true, false));
        Pieces.add(new Rei(0, 4, '♚', true, false));
        Pieces.add(new Bispo(0, 5, '♝', true, false));
        Pieces.add(new Cavalo(0, 6, '♞', true, false));
        Pieces.add(new Torre(0, 7, '♜', true, false));

        for (int i = 0; i < 8; i++) {
            Pieces.add(new Peao(1, i, '♟', true, false));
        }

        //Black pieces
        Pieces.add(new Torre(7, 0, '♖', false, true));
        Pieces.add(new Cavalo(7, 1, '♘', false, true));
        Pieces.add(new Bispo(7, 2, '♗', false, true));
        Pieces.add(new Rainha(7, 3, '♕', false, true));
        Pieces.add(new Rei(7, 4, '♔', false, true));
        Pieces.add(new Bispo(7, 5, '♗', false, true));
        Pieces.add(new Cavalo(7, 6, '♘', false, true));
        Pieces.add(new Torre(7, 7, '♖', false, true));

        for (int i = 0; i < 8; i++) {
            Pieces.add(new Peao(6, i, '♙', false, true));
        }
    }
    public static void main(String[] args) {
        ArrayList<Piece> P = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        addPieces(P);

        board.printBoardPieces(P);
        int i = 0;

        while(true) {
            System.out.print("INFORME A CORDENADA DA PECA: ");
            String input = scanner.nextLine();
            int[] coordinates = convertCoordinates(input);

            board.findPiece(P, coordinates[0], coordinates[1]);

            System.out.print("INFORME A CORDENADA DE DESTINO: ");
            String input2 = scanner.nextLine();
            int[] coordinates2 = convertCoordinates(input2);



        }

    }



}
//mostrar tabuleiro oK
//mostrar pecas oK

//selecioanr peca oK
//verifica se peça é valida oK
//verificar se é possivel mover

//pintar locais de movimento e verficar se é possivel mover
//verificar se é possivel mover
//verificar se é possivel comer
//verificar se é possivel rocar
//verificar se é possivel en passant


//selecionar destino

//verificar se movimento é valido

//mover peca