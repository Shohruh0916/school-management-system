package schoolManagementSystem.version_3.library;

import schoolManagementSystem.version_3.entities.Student;


public class StudentList {
    private Student[] students;
    private static final int CAPASITY=11;
    private int size;


    public StudentList(){
        students=new Student[CAPASITY];
    }

    public StudentList(int COPOSITY_size){
        students=new Student[COPOSITY_size];
    }

    public Student get(int index){
        return students[index];
    }

    public int capasity(){
        return students.length;
    }

    public Student add(Student student){
        if(students.length<=size){
            Student[] newStudent=new Student[2*students.length];
            for (int i = 0; i < size; i++) {
                newStudent[i]=students[i];
            }
            students=newStudent;
        }
        students[size++]=student;
        return student;
    }

    public int size(){
        return size;
    }

}
