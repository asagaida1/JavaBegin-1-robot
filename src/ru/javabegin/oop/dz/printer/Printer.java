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

            System.out.printf("Не хватило краски: %d (всего краски в принтере: %d)%n", left, paintVolume);
            charge();
        }
        System.out.printf("На печать отправлен текст: %s , длина: %d%n", text, text.length());
        paintVolume = paintVolume - text.length();
        System.out.printf("Текст распечатан: %s, у принтера осталось краски: %d\n", text,  paintVolume);
    }

    @Override
    public void charge() {
        paintVolume = paintVolume + symbolsCount;
        System.out.printf("Принтер пополнен на длину текста: %d (всего краски в принтере: %d)\n", symbolsCount, paintVolume);
    }
}
