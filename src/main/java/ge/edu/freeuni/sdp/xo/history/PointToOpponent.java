package ge.edu.freeuni.sdp.xo.history;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PointToOpponent {

    @XmlElement
    String opponentToken;

    @XmlElement
    int point;
}
