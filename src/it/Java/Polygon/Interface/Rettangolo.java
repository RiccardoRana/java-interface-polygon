package it.Java.Polygon.Interface;

public class Rettangolo implements Interface {

    private int lato1;
    private int lato2;
    private int lato3;
    private int lato4;

    public Rettangolo(int lato1, int lato2, int lato3, int lato4) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.lato4 = lato4;
    }

    @Override
    public final int calcArea() {
        return lato1 * lato2;
    }

    @Override
    public final int calcPerimetro() {
        return 2 * (lato1 + lato2);
    }

}
