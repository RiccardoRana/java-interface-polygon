package it.Java.Polygon.Interface;

public class Quadrato implements Interface{
    private int lato1;
    private int lato2;
    private int lato3;
    private int lato4;

    public Quadrato(int lato1) {
        this.lato1 = lato1;
        this.lato2 = lato1;
        this.lato3 = lato1;
        this.lato4 = lato1;

    }

    @Override
    public final int calcArea() {
        return lato1 * lato1;
    }

    @Override
    public final int calcPerimetro() {
        return lato1 * 4;
    }


}
