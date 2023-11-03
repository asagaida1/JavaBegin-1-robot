package ru.javabegin.oop.dz.printer;

public class Printer implements IPrinter {

    public Printer(int paintVolume, int symbolsCount) {
        this.paintVolume = paintVolume;
        this.symbolsCount = symbolsCount;
    }

    int paintVolume;
    int symbolsCount;


    @Override
    public int getPaintVolume() {
        return paintVolume;
    }

    public void setPaintVolume(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    @Override
    public void print(String text) {

        while(paintVolume < text.length()){
            int left = text.length() - paintVolume;
            System.out.println("Не хватило краски: " + left + "(всего краски в принтере: " + paintVolume +")");
            charge();
        }
        System.out.println("На печать отправлен текст: " + text + " , длина: " + text.length());
        paintVolume = paintVolume - text.length();
        System.out.println("Текст распечатан: " + text + ", у принтера осталось краски: " + paintVolume);
    }

    @Override
    public void charge() {
        paintVolume = paintVolume + symbolsCount;
        System.out.println("Принтер пополнен на длину текста: " + symbolsCount + " (всего краски в принтере: " + paintVolume + ")");
    }
}
