package schoolManagementSystem.Version_1;

public class School {
        private Teacher[] teachers;
        private Student[] students;
        private int teachersCount=0;
        private int studentsCount=0;

        public School(){
            this.teachers=new Teacher[10];
            this.students=new Student[10];
        }


        public Teacher[] getTeachers() {
            return teachers;
        }

        public Student[] getStudents() {
            return students;
        }

        public double getTotalMoneyEarned(){
            double totalMonayEarned=0;
            for(int i=0; i<studentsCount; i++){
                totalMonayEarned+=students[i].getFeesPaid();
            }
            return totalMonayEarned;
        }

        public double getToatalMoneySpent(){
            double totalMoneySpent=0;
            for(int i=0; i<teachersCount; i++){
                totalMoneySpent+=teachers[i].getSalaryEarned();
            }
            return  totalMoneySpent;
        }

        public void addTeacher(Teacher teacher){
            teachers[teachersCount++]=teacher;
            teacher.setSchool(this);
        }

        public void addStudent(Student student){
            students[studentsCount++]=student;
        }

}
