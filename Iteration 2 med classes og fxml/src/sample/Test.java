
package sample;

public class Test {
    private String testID;
    private Float testDate;
    private String result;
    private String strainOfCovid;

    public Test(String testID, Float testDate, String result, String strainOfCovid) {
        this.testID = testID;
        this.testDate = testDate;
        this.result = result;
        this.strainOfCovid = strainOfCovid;
    }

    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public Float getTestDate() {
        return testDate;
    }

    public void setTestDate(Float testDate) {
        this.testDate = testDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStrainOfCovid() {
        return strainOfCovid;
    }

    public void setStrainOfCovid(String strainOfCovid) {
        this.strainOfCovid = strainOfCovid;
    }

    @Override
    public String toString() {
        return "Test{" +
                "testID='" + testID + '\'' +
                ", testDate=" + testDate +
                ", result='" + result + '\'' +
                ", strainOfCovid='" + strainOfCovid + '\'' +
                '}';
    }
}