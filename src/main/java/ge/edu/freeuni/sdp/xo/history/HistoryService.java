package ge.edu.freeuni.sdp.xo.history;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class HistoryService {

    @GET
    public void getAllGames() {

    }

    @Path("{points}")
    @GET
    public void getPointsToOthers() {

    }

    @Path("{gameHistory}")
    @GET
    public void getGameHistory(@QueryParam("game_id") String gameID) {

    }

}