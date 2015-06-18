package ge.edu.freeuni.sdp.xo.history;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Move {

    @XmlElement
    public int i;

    @XmlElement
    public int j;

}
