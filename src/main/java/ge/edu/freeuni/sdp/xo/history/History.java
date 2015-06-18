package ge.edu.freeuni.sdp.xo.history;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class History {

    @XmlElement
    public Date date;

    @XmlElement
    public int result;

    @XmlElement
    public int gameId;

    @XmlElement
    public String opponentToken;
}
