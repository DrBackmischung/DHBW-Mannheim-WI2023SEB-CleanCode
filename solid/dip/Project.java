package solid.dip;

public class Project {
    private FrontendDeveloper frontendDeveloper;
    private BackendDeveloper backendDeveloper;

    public Project() {
        this.frontendDeveloper = new FrontendDeveloper();
        this.backendDeveloper = new BackendDeveloper();
    }

    public void develop() {
        frontendDeveloper.writeCode();
        backendDeveloper.writeCode();
    }
}
