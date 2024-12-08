package solid.dip.solution;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
        Developer frontendDeveloper = new FrontendDeveloper();
        Developer backendDeveloper = new BackendDeveloper();
        Developer mobileDeveloper = new MobileDeveloper();

        Project softwareProject = new FullStackAppProject(Arrays.asList(frontendDeveloper, backendDeveloper));
        System.out.println("Developing a full stack app project:");
        softwareProject.develop();

        Project mobileProject = new MobileAppProject(Arrays.asList(mobileDeveloper, backendDeveloper));
        System.out.println("Developing a mobile app project:");
        mobileProject.develop();
	}

}
