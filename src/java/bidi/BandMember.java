package bidi;

import java.util.Collection;
import java.util.LinkedList;

public class BandMember {
    private final Collection<Band> bands = new LinkedList<>();

    public Collection<Band> getBands() {
        return bands;
    }

    public void addClass(Band band){
        bands.add(band);
    }
}
