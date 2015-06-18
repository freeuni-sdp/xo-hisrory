package ge.edu.freeuni.sdp.xo.history;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FakeDataBase {

    private History createHistory(Date date, int result, int gameId, String opponentToken){
        History history = new History();
        history.date = date;
        history.result = result;
        history.gameId = gameId;
        history.opponentToken = opponentToken;
        return history;
    }

    public List<History> getAllGames() {
        List<History> allGamesList = new ArrayList<>();
        allGamesList.add(createHistory(new Date(),1,1,"01f31t-13t45-fsgst-53ge-wety2356"));
        allGamesList.add(createHistory(new Date(),0,2,"01f31t-13t45-fsgst-53ge-wety2356"));
        allGamesList.add(createHistory(new Date(),1,3,"01f31t-13t45-fsgst-53ge-wety2356"));
        return allGamesList;
    }

    private PointToOpponent createPointToOpponent(int point, String opponentToken){
        PointToOpponent pointToOpponent = new PointToOpponent();
        pointToOpponent.point = point;
        pointToOpponent.opponentToken = opponentToken;
        return pointToOpponent;
    }

    public List<PointToOpponent>  getPointsToOthers() {
        List<PointToOpponent> pointsToOthersList = new ArrayList<>();
        pointsToOthersList.add(createPointToOpponent(1,"01f31t-13t45-fsgst-53ge-wety2356"));
        pointsToOthersList.add(createPointToOpponent(-2,"01f31t-13t45-fsgst-53ge-wety2356"));
        return pointsToOthersList;
    }

    public Move createMove(int i, int j){
        Move move = new Move();
        move.i = i;
        move.j = j;
        return move;
    }

    public FullGameHistory getGameHistory(String gameID){
        FullGameHistory fullGameHistory = new FullGameHistory();
        List<Move> moves = new ArrayList<>();
        moves.add(createMove(1,1));
        moves.add(createMove(1,0));
        moves.add(createMove(0,1));
        fullGameHistory.moves = moves;
        fullGameHistory.first = "01f31t-13t45-fsgst-53ge-we2y2356";
        return fullGameHistory;
    }
}