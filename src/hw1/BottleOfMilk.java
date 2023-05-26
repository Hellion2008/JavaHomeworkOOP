package hw1;

public class BottleOfMilk extends Product{

    private double volume; // �����
    private int fat�ontent; // ���������� ��������

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFat�ontent() {
        return fat�ontent;
    }

    public void setFat�ontent(int fat�ontent) {
        this.fat�ontent = fat�ontent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fat�ontent) {
        super(brand, name, price);
        this.volume = volume;
        this.fat�ontent = fat�ontent;
    }

    @Override
    public String displayInfo() {
        return String.format("[�������]%s - %s - %f - [�����: %f; ��������: %d]", brand, name, price, volume, fat�ontent);
    }
}
