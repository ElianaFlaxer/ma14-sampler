import workspace.eliana.sampler.load.Loader;
import workspace.eliana.sampler.load.ReportJsonLoader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Loader loader = new ReportJsonLoader();
        loader.load("src/main/resources/madaReports.csv");
    }
}
