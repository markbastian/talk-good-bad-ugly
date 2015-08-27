package bidi;

import java.util.Collection;
import java.util.LinkedList;

public class Band {
    private final Collection<BandMember> bandMembers = new LinkedList<>();

    public Collection<BandMember> getBandMembers() {
        return bandMembers;
    }

    public void addStudent(BandMember bandMember){
        bandMembers.add(bandMember);
    }
}
