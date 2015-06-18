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
    public CheckAuthorization checkAuthorization = new CheckAuthorization(true);

    @GET
    public List<History> getAllGamesHistory() {
        if(!checkAuthorization.isAuthorized()) throw new WebApplicationException(401);
        return fakeDataBase.getAllGames();
    }

    @Path("points")
    @GET
    public List<PointToOpponent> getPointsToOthers() {
        if(!checkAuthorization.isAuthorized()) throw new WebApplicationException(401);
        return fakeDataBase.getPointsToOthers();
    }

    @Path("gameHistory")
    @GET
    public FullGameHistory getGameHistory(@QueryParam("game_id") String gameId) {
        if(!checkAuthorization.isAuthorized()) throw new WebApplicationException(401);
        if (gameId == null) throw new WebApplicationException(Response.Status.BAD_REQUEST);

        return fakeDataBase.getGameHistory(gameId);
    }

}