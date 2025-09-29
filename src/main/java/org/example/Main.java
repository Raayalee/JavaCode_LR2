package org.example;

import patient.model.Patient;

/** Головний клас програми
 * Створює масив пацієнтів і виводить їх за різними критеріями.
 */

public class Main {

    /** Основний метод програми
     *
     * @param args не використовується
     */
    public static void main(String[] args) {

        Patient[] patientsArray = createPatientsArray();

        printPatientsByDiagnose(patientsArray, "schizophrenia");
        printPatientsByMedicalCardNum(patientsArray, 100, 160);
        printPatientsByFirstFigureOfPhoneNum(patientsArray, "9");

    }

    /**
     * Створює та повертає масив пацієнтів.
     *
     * @return масив об'єктів класу Patient
     */
    private static Patient[] createPatientsArray() {
        return new Patient[]{
                new Patient(1,"Sliusar","Viktoria","Volodymurivna", "Lutsk","99-510-3626",101,"allergy"),
                new Patient(2,"Skrypnyk","Anna","Yuriyivna","Vinnytsia","69-936-8340",120,"schizophrenia"),
                new Patient(3,"Babiy","Olha","Andriyivna","Dubno","95-338-1594",123,"schizophrenia"),
                new Patient(4,"Basarab","Yaroslav","Olehovych","Lviv","76-512-3020",142,"flu"),
                new Patient(5,"Dyachenko","Nazaretto","Yaneznayu","Kiyv","69-906-8890",180,"allergy"),
                new Patient(6,"Kucheryava","Anna","Dmitryvna","Medenichy","90-300-1555",158,"schizophrenia"),
                new Patient(7,"Pasichuk","Alla","Valeriyivna","Polonne","66-101-3426",170,"flu"),
                new Patient(8,"Melnyk","Oleksandr","Dmitrovich","Odessa","96-123-1651",200,"astma"),
        };
    }

    /**
     * Виводить у консоль пацієнтів із заданим діагнозом.
     *
     * @param patients масив пацієнтів
     * @param diagnose діагноз для пошуку
     */
    private static void printPatientsByDiagnose(Patient[] patients, String diagnose){
        System.out.println("\nPatients with diagnose: " + diagnose);

        for (Patient el: patients){
            if(el.getDiagnose().equals(diagnose)){
                System.out.println(el);
            }
        }
    }

    /**
     * Виводить у консоль пацієнтів, номери медичних карток яких
     * знаходяться в межах вказаного діапазону.
     *
     * @param patients масив пацієнтів
     * @param startOfRange початок діапазону
     * @param endOfRange кінець діапазону
     */
    private static void printPatientsByMedicalCardNum(Patient[] patients, int startOfRange, int endOfRange){
        System.out.println("\nPatients from this range (from " + startOfRange + " to " + endOfRange + ") of medical card values: ");

        for (Patient el: patients) {
            if(el.getMedicalCardNum() >= startOfRange && el.getMedicalCardNum() <= endOfRange){
                System.out.println(el);
            }
        }
    }

    /**
     * Виводить у консоль пацієнтів, номери телефонів яких
     * починаються з вказаної цифри, та підраховує їх кількість.
     *
     * @param patients масив пацієнтів
     * @param firstFigure перша цифра телефонного номера
     */
    private static void printPatientsByFirstFigureOfPhoneNum(Patient[] patients, String firstFigure){
        System.out.println("\nPatients whose phone number starts with figure " + firstFigure + ":");
        int counter = 0;

        for (Patient el: patients){
            if(el.getPhoneNum().startsWith(firstFigure)){
                System.out.println(el);
                counter++;
            }
        }
        System.out.println("Number of patients with this first figure in phone number: " + counter);
    }

}