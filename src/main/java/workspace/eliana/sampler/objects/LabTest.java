package workspace.eliana.sampler.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="labTest")
public class LabTest {

    @XmlElement
    private String idNum;
    @XmlElement
    private String idType;
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private String resultDate;
    @XmlElement
    private String birthDate;
    @XmlElement
    private String labCode;
    @XmlElement
    private String stickerNumber;
    @XmlElement
    private String resultTestCorona;
    @XmlElement
    private String variant;
    @XmlElement
    private String testType;

    @XmlElement
    private String joinDate;
    @XmlElement
    private String healthCareId;
    @XmlElement
    private String healthCareName;

    public LabTest()
    {

    }

    public LabTest(String idNum, String idType, String firstName, String lastName,
                   String resultDate, String birthDate, String labCode,
                   String stickerNumber, String resultTestCorona, String variant, String testType,
                   String joinDate, String healthCareId, String healthCareName)
    {
        this.idNum=idNum;
        this.idType=idType;
        this.firstName=firstName;
        this.lastName=lastName;
        this.resultDate=resultDate;
        this.birthDate=birthDate;
        this.labCode=labCode;
        this.stickerNumber=stickerNumber;
        this.resultTestCorona=resultTestCorona;
        this.variant=variant;
        this.testType=testType;
        this.joinDate=joinDate;
        this.healthCareId=healthCareId;
        this.healthCareName=healthCareName;
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
                ", resultTestCorona='" + resultTestCorona + '\'' +
                ", variant='" + variant + '\'' +
                ", testType='" + testType + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", healthCareId='" + healthCareId + '\'' +
                ", healthCareName='" + healthCareName + '\'' +
                '}';
    }

    public String getIdNum() {
        return idNum;
    }

    public String getIdType() {
        return idType;
    }

    public boolean isPositive()
    {
        return Integer.parseInt(this.resultTestCorona)==1;
    }
}
