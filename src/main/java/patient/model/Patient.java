package patient.model;

/**
 * Модель сутності {@code Patient}, що представляє пацієнта лікарні
 *
 * Клас зберігає базову інформацію про пацієнта, а саме:
 * ідентифікатор, ПІБ, адресу, номер телефону,
 * номер медичної карти, а також діагноз
 *
 * У програмі створений клас допомагає зчитувати та подавати інформацію
 * про пацієнтів, фільтрувати її у залежності від вимог завдання
 */
public class Patient {

    /** Унікальний ідентифікатор пацієнта */
    private int patientID;

    /** Прізвище пацієнта */
    private String lastName;

    /** Ім'я пацієнта */
    private String firstName;

    /** По батькові пацієнта */
    private String paternal;

    /** Адреса пацієнта */
    private String address;

    /** Номер телефону пацієнта */
    private String phoneNum;

    /** Номер медичної карти пацієнта */
    private int medicalCardNum;

    /** Діагноз пацієнта */
    private String diagnose;


    /** Повний конструктор класу Patient, що створює об'єкт
     *
     * @param patientID ID пацієнта
     * @param lastName прізвище пацієнта
     * @param firstName ім'я пацієнта
     * @param paternal по батькові пацієнта
     * @param address адреса пацієнта
     * @param phoneNum номер телефону пацієнта
     * @param medicalCardNum номер медичної карти пацієнта
     * @param diagnose діагноз пацієнта
     */
    public Patient (int patientID, String lastName, String firstName, String paternal,
                    String address, String phoneNum, int medicalCardNum, String diagnose){
        this.patientID = patientID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.paternal = paternal;
        this.address = address;
        this.phoneNum = phoneNum;
        this.medicalCardNum = medicalCardNum;
        this.diagnose = diagnose;
    }


    /** Гетери для повернення даних:
     * @return ID пацієнта
     */
    public int getPatientID() {
        return patientID;
    }

    /**
     * @return прізвище пацієнта
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return ім'я пацієнта
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return по батькові пацієнта
     */
    public String getPaternal() {
        return paternal;
    }

    /**
     * @return адреса пацієнта
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return номер телефону пацієнта
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @return номер медичної карти пацієнта
     */
    public int getMedicalCardNum() {
        return medicalCardNum;
    }

    /**
     * @return діагноз пацієнта
     */
    public String getDiagnose() {
        return diagnose;
    }

    /** Сетери для оновлення даних:
     * @param patientID новий ID пацієнта
     */
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    /**
     * @param lastName нове прізвище пацієнта
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstName нове ім'я пацієнта
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param paternal нове по батькові пацієнта
     */
    public void setPaternal(String paternal) {
        this.paternal = paternal;
    }

    /**
     * @param address нова адреса пацієнта
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param phoneNum новий номер телефону пацієнта
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * @param medicalCardNum новий номер медичної картки
     */
    public void setMedicalCardNum(int medicalCardNum) {
        this.medicalCardNum = medicalCardNum;
    }

    /**
     * @param diagnose новий діагноз
     */
    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    /**Метод для повернення інформації про пацієнта у зручному форматі на консоль
     *
     * @return рядок із даними пацієнта
     */

    @Override
    public String toString() {
        return "\nPatient info:\n" + "id = " + getPatientID() +
                "\nlast name = " + getLastName() +
                "\nfirst name = " + getFirstName() +
                "\npaternal = " + getPaternal() +
                "\naddress = " + getAddress() +
                "\nphone number = " + getPhoneNum() +
                "\nmedical card number = " + getMedicalCardNum() +
                "\ndiagnose = " + getDiagnose();
    }
}