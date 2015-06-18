package ge.edu.freeuni.sdp.xo.history;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class HistoryService {

    @GET
    public List<History> getAllGamesHistory() {
        return null;
    }

    @Path("{points}")
    @GET
    public List<PointToOpponent> getPointsToOthers() {
        return null;
    }

    @Path("{gameHistory}")
    @GET
    public FullGameHistory getGameHistory(@QueryParam("game_id") String gameID) {
        return null;
    }

}