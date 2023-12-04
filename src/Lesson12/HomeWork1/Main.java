package Lesson12.HomeWork1;

public class Main {
    public static void main(String[] args) {
        Student[] learners = new Student[10];

        learners[0] = new Student("firstName0", "lastName0", "group0", 3.5);
        learners[1] = new Student("firstName1", "lastName1", "group0", 5.0);
        learners[2] = new Student("firstName2", "lastName2", "group0", 5.0);
        learners[3] = new Student("firstName3", "lastName3", "group1", 4.5);
        learners[4] = new Student("firstName4", "lastName4", "group1", 4.5);
        learners[5] = new Aspirant("firstName5", "lastName5", "group2", 4.0);
        learners[6] = new Aspirant("firstName6", "lastName6", "group2", 5.0);
        learners[7] = new Aspirant("firstName7", "lastName7", "group2", 5.0);
        learners[8] = new Aspirant("firstName8", "lastName8", "group3", 3.0);
        learners[9] = new Aspirant("firstName9", "lastName9", "group3", 4.5);

        for (Student lerner : learners) {
            System.out.println(lerner.toString()+" money=" + lerner.getSchoolarship());
        }

    }
}
