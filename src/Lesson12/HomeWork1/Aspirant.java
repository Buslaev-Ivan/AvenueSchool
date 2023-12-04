package Lesson12.HomeWork1;

//Аспирант подкласс студента, без добавления уникальных переменных
//но с добавлением уникального условия выполнения getSchoolship()
public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    int getSchoolarship() {
        if (getAverageMark() == 5.0) {
            return 2500;
        } else return 2200;
    }
}
