package ge.edu.freeuni.sdp.xo.history;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class FullGameHistory {

    @XmlElement
    List<Move> moves;

    @XmlElement
    String first;
}
