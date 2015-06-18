package java.ge.edu.freeuni.sdp.xo.history;

import ge.edu.freeuni.sdp.xo.history.CheckAuthorization;
import ge.edu.freeuni.sdp.xo.history.HistoryService;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

public class TestHistoryService extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(HistoryService.class);
    }

    @Test
    public void testGetAllGamesHistory() {
        Response actual = target("/").request().get();
        assertEquals(Response.Status.OK.getStatusCode(), actual.getStatus());
    }

    @Test
    public void testGetPointsToOthers() {
        Response actual = target("/points").request().get();
        assertEquals(Response.Status.OK.getStatusCode(), actual.getStatus());
    }

    @Test (expected=WebApplicationException.class)
    public void testPublicChatMessagesException() {
        HistoryService historyService = new HistoryService();
        historyService.checkAuthorization = Mockito.mock(CheckAuthorization.class);
        Mockito.when(historyService.checkAuthorization.isAuthorized()).thenReturn(false);
        historyService.getAllGamesHistory();
    }

    @Test
    public void testGetGameHistory() {
        Response actual = target("/gameHistory?game_id=5").request().get();
        assertEquals(Response.Status.OK.getStatusCode(), actual.getStatus());
    }

    @Test
    public void testGetGameHistoryWithException() {
        Response actual = target("/gameHistory").request().get();
        assertEquals(Response.Status.BAD_REQUEST, actual.getStatus());
    }

    @Test
    public void testNotFound() {
        Response actual = target("/notFound").request().get();
        assertEquals(Response.Status.NOT_FOUND, actual.getStatus());
    }
}
