package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.Board;
import CaseStudy.tictactoe.models.Cell;
import CaseStudy.tictactoe.models.CellState;
import CaseStudy.tictactoe.models.Move;

import java.util.List;

public class EasyBotStrategy implements BotStrategy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> cellList: board.getCells()) {
            for(Cell cell: cellList) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(cell, null);
                }
            }
        }
        return null;
    }
}
