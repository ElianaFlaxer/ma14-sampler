package workspace.eliana.sampler.objects;

public class Report {

    private String mdaCode;
    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String buildingNumber;
    private String barcode;
    private String getDate;
    private String takeDate;
    private String resultDate;

    public Report(String mdaCode, String idNum, String idType, String firstName,
                  String lastName, String city, String street, String buildingNumber,
                  String barcode, String getDate, String takeDate, String resultDate)
    {
        this.mdaCode=mdaCode;
        this.idNum=idNum;
        this.idType=idType;
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
        this.street=street;
        this.buildingNumber=buildingNumber;
        this.barcode=barcode;
        this.getDate=getDate;
        this.takeDate=takeDate;
        this.resultDate=resultDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "mdaCode='" + mdaCode + '\'' +
                ", idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
          //      ", supplierCode='" + supplierCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", barcode='" + barcode + '\'' +
                ", getDate='" + getDate + '\'' +
                ", takeDate='" + takeDate + '\'' +
                ", resultDate='" + resultDate + '\'' +
                '}';
    }


    public String getIdNum() {
        return idNum;
    }

    public String getIdType() {
        return idType;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getResultDate() {
        return resultDate;
    }

    public String getTakeDate() {
        return takeDate;
    }

}