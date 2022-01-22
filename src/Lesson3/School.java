package Lesson3;

public class School {
    private Student[] students;
    private int studentsNumber;

    public School(int studentsNumber) {
        students = new Student[studentsNumber];
    }

    public void add(Student s) throws NoMoreSpaceException{
        if (studentsNumber >= students.length){
            throw new NoMoreSpaceException("Brak miejsc w szkole. Maksymalna ilośc uczniów to"
            + students.length);
        }
        students[studentsNumber]=s;
        studentsNumber++;
    }

    public Student findStudent(String firstName, String lastName) throws NoElementFoundException{
        for (int i = 0; i < studentsNumber; i++) {
            if (students[i].getFirstName().equals(firstName) &&
            students[i].getLastName().equals(lastName)){
                return students[i];
            }

        }
        throw new NoElementFoundException("Nie znaleziono studenta " + firstName + " " + lastName);
    }
}
