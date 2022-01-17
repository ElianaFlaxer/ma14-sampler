package workspace.eliana.sampler.extract;

import workspace.eliana.sampler.read.CsvReader;
import workspace.eliana.sampler.read.FileTypeReader;
import workspace.eliana.sampler.read.ReportCsvReader;

import java.io.IOException;
import java.util.List;

public class ReportCsvExtractor implements CsvExtractor {

    public void callWriting() throws IOException {

        ReportCsvReader reportReader = new ReportCsvReader();
        reportReader.getObjectsByFiles(reportReader.objectsFromFile());
    }

}
