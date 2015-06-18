package java.ge.edu.freeuni.sdp.xo.history;

import ge.edu.freeuni.sdp.xo.history.HistoryService;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

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
    }

    @Test
    public void testGetPointsToOthers() {
    }

    @Test
    public void testGetGameHistory() {
    }

    @Test
    public void testGetGameHistoryWithException() {
    }
}
