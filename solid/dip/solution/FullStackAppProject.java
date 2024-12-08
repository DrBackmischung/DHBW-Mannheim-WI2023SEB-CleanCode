package solid.dip.solution;

import java.util.List;

public class FullStackAppProject implements Project {
    private final List<Developer> developers;

    public FullStackAppProject(List<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public void develop() {
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
