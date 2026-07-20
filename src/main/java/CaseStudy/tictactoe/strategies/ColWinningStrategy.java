package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.Board;
import CaseStudy.tictactoe.models.Move;
import CaseStudy.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy{
    private Map<Integer, Map<Symbol, Integer>> colCounts = new HashMap<>();

    @Override
    public boolean checkWinner (Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        colCounts.putIfAbsent(col, new HashMap<>());
        Map<Symbol, Integer> symbolCountMap = colCounts.get(col);
        symbolCountMap.put(symbol, symbolCountMap.getOrDefault(symbol,0)+1);

        return symbolCountMap.get(symbol) == board.getDimension();
    }
}
