package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {

    private Map<Integer, Map<Symbol, Integer>> rowCounts = new HashMap<>();

}
