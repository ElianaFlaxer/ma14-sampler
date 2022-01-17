import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.objects.Report;
import workspace.eliana.sampler.read.CsvReader;
import workspace.eliana.sampler.read.FileTypeReader;
import workspace.eliana.sampler.read.ReportCsvReader;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        FileTypeReader fr = new ReportCsvReader("src/main/resources/madaReports.csv");

        List<List<Report>> listOfLists = fr.objectsByFiles();

        for( List<Report> l : listOfLists)
        {
            for(Report rep : l)
            {
                System.out.println(rep.toString());
            }
        }

        System.out.println(new ConfigLoader().load().getProperty("maxRecordsNum"));



        //FileTypeWriter fw = new ReportJsonWriter();
        //ReportJsonWriter r = new ReportJsonWriter();
        //r.write();

        //fw.writeToFiles(r.getObjectsByFiles());

        /*
        ConfigLoader cl = new ConfigLoader();
        cl.load();

        Loader l = new ReportJsonLoader();
        l.load("src/main/resources/madaReports.csv");

         */
    }

}
