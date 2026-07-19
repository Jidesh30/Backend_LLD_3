package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.Board;
import CaseStudy.tictactoe.models.Move;

public interface BotStrategy {
    Move makeMove(Board board);
}
