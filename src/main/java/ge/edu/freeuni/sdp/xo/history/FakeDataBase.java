package ge.edu.freeuni.sdp.xo.history;

import java.util.ArrayList;
import java.util.List;

public class FakeDataBase {
    public List<History> getAllGames() {
        List<History> allGamesList = new ArrayList<>();
        return allGamesList;
    }

    public List<PointToOpponent>  getPointsToOthers() {
        List<PointToOpponent> pointsToOthersList = new ArrayList<>();
        return pointsToOthersList;
    }

    public Object getGameHistory(String gameID){
        FullGameHistory fullGameHistory = new FullGameHistory();
        return fullGameHistory;
    }
}
