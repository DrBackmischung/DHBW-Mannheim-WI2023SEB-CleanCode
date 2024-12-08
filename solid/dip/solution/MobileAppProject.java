package solid.dip.solution;

import java.util.List;

public class MobileAppProject implements Project {
    private final List<Developer> developers;

    public MobileAppProject(List<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public void develop() {
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
