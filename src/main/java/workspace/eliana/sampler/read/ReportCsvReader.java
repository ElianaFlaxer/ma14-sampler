package workspace.eliana.sampler.read;

import workspace.eliana.sampler.objects.Report;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;


public class ReportCsvReader extends CsvReader {

    public ReportCsvReader(String fileName) {
        super(fileName);
    }

    public Report createObject(String[] rec)
    {
        return new Report(rec[0],rec[1],rec[2],rec[3],rec[4],rec[5],rec[6],rec[7],
                rec[8],rec[9],rec[10],rec[11]);
    }
}
