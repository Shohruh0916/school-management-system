package schoolManagementSystem_V1;

public class Student {
        private int id;
        private String firstName;
        private String lastName;
        private int grade;
        private double feesTotal;
        private double feesPaid=0;
        private School school;

        public Student(int id, String firstName, String lastName, int grade, double feesTotal){
            this.id=id;
            this.firstName=firstName;
            this.lastName=lastName;
            this.grade=grade;
            this.feesTotal=feesTotal;
        }

        int getId(){
            return  id;
        }

        String  getFirstName(){
            return  firstName;
        }

        int getGrade(){
            return  grade;
        }


        int getFeesPaid(){
            return (int) feesPaid;
        }

        int getFeesTotal(){
            return (int) feesTotal;
        }

        public double getRemainingFees(){
            return  feesTotal-feesPaid;
        }

        void setGrade(int grade){
            this.grade=grade;
        }

        public String  getName(){
            return firstName+" "+lastName;
        }

        public void pay(int fees){
            feesPaid+=fees;
        }


        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", grade=" + grade +
                    ", feesTotal=" + feesTotal +
                    ", feesPaid=" + feesPaid +
                    ", school=" + school +
                    '}';
        }
}
