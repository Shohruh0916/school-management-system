public class Main {
    public static void main(String[] args) {
        School school=new School();
        Teacher teacher1=new Teacher(1,"Hilber","Schild",500);
        Teacher teacher2=new Teacher(2,"James","Golsing",700);
        Teacher teacher3=new Teacher(3,"John","Doe",600);

        Student student1=new Student(1,"Ali","Valiyev",3,30000);
        Student student2=new Student(2,"Shohruh","Sharipov",2,40000);
        Student student3=new Student(3,"Javohir","Komilbayev",1,50000);

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        System.out.println("Earned money: $"+school.getTotalMoneyEarned());
        System.out.println("Spend money: $"+school.getToatalMoneySpent());
        System.out.println();

        student1.pay(5000);
        System.out.println(student1.getName()+" remaining fees: $"+student1.getRemainingFees());

        teacher1.receivSalary();

        System.out.println("Earned money: $"+school.getTotalMoneyEarned());
        System.out.println("Spend money: $"+school.getToatalMoneySpent());
        System.out.println();

        student2.pay(6000);
        System.out.println(student2.getName()+" remaining fees: $"+student2.getRemainingFees());

        teacher2.receivSalary();

        System.out.println("Earned money: $"+school.getTotalMoneyEarned());
        System.out.println("Spend money: $"+school.getToatalMoneySpent());
        System.out.println();

    }
}
