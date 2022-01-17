package workspace.eliana.sampler.objects;

public class LabTest {

    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String resultDate;
    private String birthDate;
    private String labCode;
    private String stickerNumber;
    private String resultTestCorna;
    private String variant;
    private String testType;

    public LabTest(String idNum, String idType, String firstName, String lastName,
                   String resultDate, String birthDate, String labCode,
                   String stickerNumber, String resultTestCorna, String variant, String testType)
    {
        this.idNum=idNum;
        this.idType=idType;
        this.firstName=firstName;
        this.lastName=lastName;
        this.resultDate=resultDate;
        this.birthDate=birthDate;
        this.labCode=labCode;
        this.stickerNumber=stickerNumber;
        this.resultTestCorna=resultTestCorna;
        this.variant=variant;
        this.testType=testType;
    }

    @Override
    public String toString() {
        return "LabTest{" +
                "idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", resultDate='" + resultDate + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", labCode='" + labCode + '\'' +
                ", stickerNumber='" + stickerNumber + '\'' +
                ", resultTestCorna='" + resultTestCorna + '\'' +
                ", variant='" + variant + '\'' +
                ", testType='" + testType + '\'' +
                '}';
    }
}
