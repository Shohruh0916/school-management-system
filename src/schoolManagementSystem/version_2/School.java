package schoolManagementSystem.version_2;

public class School {
    private Teacher[] teachers;
    private Student[] students;
    int studentCount=0;
    int teacherCount=0;

    public School() {
        this.students =new Student[2];
        this.teachers =new Teacher[2];
    }



    public Teacher[] getTeachers() {

        return teachers;
    }

    public Student[] getStudents() {

        return students;
    }

    public double getTotolMonayEarned(){
        double totol=0;
        for (int i = 0; i <studentCount ; i++) {

            totol+=students[i].getFeesPaid();
        }
        return totol;
    }

    public double getTotolMonaySpent(){
        double spent=0;
        for (int i = 0; i <teacherCount ; i++) {

            spent+=teachers[i].getSalaryEarned();
        }
        return spent;
    }

    public void addTeacher(Teacher teacher){
        if(teachers.length<=teacherCount){
            Teacher[] newTeacher=new Teacher[2*teachers.length];
            for (int i = 0; i < teachers.length; i++) {
                newTeacher[i]=teachers[i];
            }
            teachers=newTeacher;

        }
        teachers[teacherCount++]=teacher;
        teacher.setSchool(this);
    }

    public void addStudent(Student student){
        if(students.length<=studentCount){
            Student[] newStudent=new Student[2*teachers.length];
            for (int i = 0; i < students.length; i++) {
                newStudent[i]=students[i];
            }
            students=newStudent;

        }
        students[studentCount++]=student;
    }
}
