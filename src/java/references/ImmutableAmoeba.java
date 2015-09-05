package references;

import java.util.Collection;
import java.util.LinkedList;

public class ImmutableAmoeba {
    private final ImmutableAmoeba parent;
    private final Collection <ImmutableAmoeba> children = new LinkedList<>();

    public ImmutableAmoeba(ImmutableAmoeba parent) {
        this.parent = parent;
    }

    public ImmutableAmoeba reproduce(){
        ImmutableAmoeba child = new ImmutableAmoeba(this);
        children.add(child);
        return child;
    }
}
