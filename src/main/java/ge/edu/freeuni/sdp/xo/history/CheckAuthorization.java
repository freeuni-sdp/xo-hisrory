package ge.edu.freeuni.sdp.xo.history;

public class CheckAuthorization {
    private boolean authorized;

    public CheckAuthorization(boolean authorized) {
        this.authorized = authorized;
    }

    public boolean isAuthorized(){
        return authorized;
    }
}
