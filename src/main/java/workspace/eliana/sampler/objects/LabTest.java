package workspace.eliana.sampler.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlAccessorType(XmlAccessType.FIELD)
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

    public LabTest()
    {

    }

    public LabTest(String idNum, String idType, String firstName, String lastName,
                   String resultDate, String birthDate, String labCode,
                   String stickerNumber, String resultTestCorona, String variant, String testType)
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
                ", resultTestCorna='" + resultTestCorona + '\'' +
                ", variant='" + variant + '\'' +
                ", testType='" + testType + '\'' +
                '}';
    }
}
