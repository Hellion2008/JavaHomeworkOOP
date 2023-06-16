package hw7.observer;

import java.util.Random;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        DepartmentHead wayne = new DepartmentHead("Wayne");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(wayne);

        for (int i = 0; i < 3; i++){
            geekBrains.needEmployee("Преподаватель", randomSalary(70000, 100000));
            google.needEmployee("Java-программист", randomSalary(150000, 200000));
            yandex.needEmployee("Курьер", randomSalary(30000, 50000));
            System.out.println("________________________________");
        }
    }

    static double randomSalary(double min, double max){
        Random random = new Random();
        return random.nextDouble(min, max);
    }

}
