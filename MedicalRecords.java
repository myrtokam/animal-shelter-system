import java.util.Date;

public class MedicalRecords {
    private String medicalrecord;
    private Date medicalExamingdDate;
    private String DoctorsName;
    private  String Diagnosis;
    private String MedicalTreatment;
    private  String MedicalPrescriptions;
    private String MedicalNotes;

    public static void create_medical_record()
    {
    }

    public String getMedicalrecord() {
        return medicalrecord;
    }

    public void setMedicalrecord(String medicalrecord) {
        this.medicalrecord = medicalrecord;
    }

    public Date getMedicalExamingdDate() {
        return medicalExamingdDate;
    }

    public void setMedicalExamingdDate(Date medicalExamingdDate) {
        this.medicalExamingdDate = medicalExamingdDate;
    }

    public String getDoctorsName() {
        return DoctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        DoctorsName = doctorsName;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public String getMedicalTreatment() {
        return MedicalTreatment;
    }

    public void setMedicalTreatment(String medicalTreatment) {
        MedicalTreatment = medicalTreatment;
    }

    public String getMedicalPrescriptions() {
        return MedicalPrescriptions;
    }

    public void setMedicalPrescriptions(String medicalPrescriptions) {
        MedicalPrescriptions = medicalPrescriptions;
    }

    public String getMedicalNotes() {
        return MedicalNotes;
    }

    public void setMedicalNotes(String medicalNotes) {
        MedicalNotes = medicalNotes;
    }

    public MedicalRecords() {
    }

    public MedicalRecords(String medicalrecord, Date medicalExamingdDate, String doctorsName, String diagnosis, String medicalTreatment, String medicalPrescriptions, String medicalNotes) {
        this.medicalrecord = medicalrecord;
        this.medicalExamingdDate = medicalExamingdDate;
        DoctorsName = doctorsName;
        Diagnosis = diagnosis;
        MedicalTreatment = medicalTreatment;
        MedicalPrescriptions = medicalPrescriptions;
        MedicalNotes = medicalNotes;
    }

    public static void connect_medical_record_to_animal()
    {
    }
    public static void medical_examination_date()
    {
    }
    public static void DoctorsName()
    {
    }
    public static void Diagnosis()
    {
    }
    public static void MedicalTreatment()
    {
    }
    public static void MedicalPrescriptions()
    {
    }
    public static void MedicalNotes()
    {
    }
    public static void MedicalHistoryPerAnimal()
    {
    }
}
