import workspace.eliana.sampler.objects.Report;
import workspace.eliana.sampler.read.FileTypeReader;
import workspace.eliana.sampler.read.ReportCsvReader;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        FileTypeReader fr = new ReportCsvReader();
        List<Report> list = fr.objectsFromFile("src/main/resources/madaReports.csv");

        for(Report r : list)
        {
            System.out.println(r.toString());
        }
    }

}
