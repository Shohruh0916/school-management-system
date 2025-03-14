package schoolManagementSystem.version_3.library;


import schoolManagementSystem.version_3.entities.Teacher;

public class TeacherList {
    private Teacher[] teachers;
    static final int CAPASITY=11;
    private int size;


    public TeacherList(){
        teachers=new Teacher[CAPASITY];
    }

    public TeacherList(int COPOSITY_size){
        teachers=new Teacher[COPOSITY_size];
    }

    public Teacher get(int index){
        return teachers[index];
    }

    public int capasity(){
        return teachers.length;
    }

    public Teacher add(Teacher teacher){
        if(teachers.length<=size){
            Teacher[] newTeacher=new Teacher[2*teachers.length];
            for (int i = 0; i < size; i++) {
                newTeacher[i]=teachers[i];
            }
            teachers=newTeacher;
        }
        teachers[size++]=teacher;
        return teacher;
    }
    public int size(){
        return size;
    }
}
