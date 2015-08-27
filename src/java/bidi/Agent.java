package bidi;

public class Agent {
    public static void join(BandMember bandMember, Band band){
        bandMember.addClass(band);
        band.addStudent(bandMember);
    }
}
