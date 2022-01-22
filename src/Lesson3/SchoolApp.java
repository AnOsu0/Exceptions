package Lesson3;

public class SchoolApp {
    public static void main(String[] args) {
        School school = new School(3);
        try {
            school.add(new Student(1, "Anna","Kowalska"));
            school.add(new Student(2, "Maria","Zawadzka"));
            school.add(new Student(2, "Paweł","Bogucki"));
        } catch (NoMoreSpaceException e) {
            System.out.println(e.getMessage());
        }
        try {
            Student student = school.findStudent("Krzysztof", "Zawada");
            System.out.println("Znaleziony student ma id: " + student.getStudentID());
        } catch (NoElementFoundException e){
            System.out.println(e.getMessage());
        }


    }
}