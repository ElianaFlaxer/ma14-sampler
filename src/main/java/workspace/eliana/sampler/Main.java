package workspace.eliana.sampler;

import health_care_provider.errors.InvalidIdException;
import workspace.eliana.sampler.load.LabTestXmlLoader;
import workspace.eliana.sampler.load.Loader;
import workspace.eliana.sampler.load.PositivePersonLoader;
import workspace.eliana.sampler.load.ReportJsonLoader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InvalidIdException {

        Loader reportLoader = new ReportJsonLoader();
        reportLoader.load("src/main/resources/madaReports.csv");

        Loader LabTeatLoader = new LabTestXmlLoader();
        LabTeatLoader.load("src/main/resources/LabTests.csv");

        Loader positiveLoader = new PositivePersonLoader();
        positiveLoader.load();
    }
}
