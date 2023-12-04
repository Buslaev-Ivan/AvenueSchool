package Lesson10.HomeWork;

//создали подкласс журналы с добавлением в нем индивидуальных переменных
public class Journal extends Product{
     int volumeOfTheJournal;

     public Journal(String name, int yearOfPublication, String publisher, int volumeOfTheJournal) {
          super(name, yearOfPublication, publisher);
          this.volumeOfTheJournal = volumeOfTheJournal;
     }

}
