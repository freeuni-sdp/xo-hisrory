package ge.edu.freeuni.sdp.xo.history;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class HistoryService {

    private FakeDataBase fakeDataBase = new FakeDataBase();

    @GET
    public List<History> getAllGamesHistory() {
        return fakeDataBase.getAllGames();
    }

    @Path("{points}")
    @GET
    public List<PointToOpponent> getPointsToOthers() {
        return fakeDataBase.getPointsToOthers();
    }

    @Path("{gameHistory}")
    @GET
    public FullGameHistory getGameHistory(@QueryParam("game_id") String gameId) {
        if (gameId == null)
            throw new WebApplicationException(Response.Status.NOT_FOUND);

        return fakeDataBase.getGameHistory(gameId);

    }

}