package references;

import java.util.Collection;
import java.util.LinkedList;

public class MutableAmoeba {
    public MutableAmoeba parent = null;
    public final Collection<MutableAmoeba> children =
            new LinkedList<>();

    public MutableAmoeba reproduce(){
        MutableAmoeba child = new MutableAmoeba();
        child.parent = this;
        children.add(child);
        return child;
    }
}
