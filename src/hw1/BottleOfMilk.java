package hw1;

public class BottleOfMilk extends Product{

    private double volume; // îáúåì
    private int fatÑontent; // Ñîäåğæàíèå æèğíîñòè

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFatÑontent() {
        return fatÑontent;
    }

    public void setFatÑontent(int fatÑontent) {
        this.fatÑontent = fatÑontent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fatÑontent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatÑontent = fatÑontent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Áóòûëêà]%s - %s - %f - [îáúåì: %f; æèğíîñòü: %d]", brand, name, price, volume, fatÑontent);
    }
}
