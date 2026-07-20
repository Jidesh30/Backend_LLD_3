package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.*;

import java.util.List;

public class EasyBotStrategy implements BotStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        for(List<Cell> cellList: board.getCells()) {
            for(Cell cell: cellList) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(cell, player);
                }
            }
        }
        return null;
    }
}
