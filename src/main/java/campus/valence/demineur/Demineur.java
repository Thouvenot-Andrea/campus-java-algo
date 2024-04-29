package campus.valence.demineur;
import java.util.HashSet;
import java.util.Set;

public class Demineur {

    public static Demineur create(int bombCount, int boardSize) {
        Case[][] board = new Case[boardSize][boardSize];
        Demineur demineur = new Demineur(board);
        demineur.generateBombs(bombCount);
        return demineur;
    }

    private Case[][] board;

    protected Demineur(Case[][] board) {
        this.board = board;
    }

    String boardAsString() {
        return "";
    }

    public Case[][] getBoard() {
        return board;
    }

    public int countBombsAround(int x, int y) {
        throw new RuntimeException("To be implemented");
    }

    private final Set<Case.BombCase> bombes = new HashSet<>();

    private void generateBombs(int bombCount){
        while(bombes.size() < bombCount){
            Case.BombCase bomb = new Case.BombCase(10,10);
            bombes.add(bomb);
        }
    }

}
