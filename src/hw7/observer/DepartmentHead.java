package hw7.observer;

import java.util.Random;

public class DepartmentHead implements Observer{

    private static Random random = new Random();

    private String name;

    private String nameVacancy;

    private double minSalary;

    private boolean hasJob;

    public DepartmentHead(String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(100000, 120000);
        hasJob = false;
    }


    @Override
    public void receiveOffer(String companyName, double salary, String vacancy) {
        if (minSalary <= salary){
            System.out.printf("Руководитель %s (%.2f) >>> Мне нужна эта работа (%s)! [%s - %.2f]\n",
                    name, minSalary, vacancy, companyName, salary);
            hasJob = true;
        }
        else {
            System.out.printf("Руководитель %s >>> Я найду работу (%s) получше (%.2f)! [%s - %.2f]\n",
                    name, vacancy, minSalary, companyName, salary);
        }
    }

    @Override
    public boolean takeJob(String vacancy) {
        return hasJob;
    }

    @Override
    public String getVacancyName() {
        return nameVacancy;
    }
}
