package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetnaTacka, krajnjaTacka;
    boolean pocetnaPripadaIntervalu, krajnjaPripadaIntervalu;
    public Interval () { this (0,0,false,false); }
    public Interval (double pocetnaTacka, double krajnjaTacka, boolean pocetnaPripadaIntervalu, boolean krajnjaPripadaIntervalu) throws IllegalArgumentException {
        if(pocetnaTacka > krajnjaTacka) throw new IllegalArgumentException();
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.pocetnaPripadaIntervalu = pocetnaPripadaIntervalu;
        this.krajnjaPripadaIntervalu = krajnjaPripadaIntervalu;
    }

    public double getPocetnaTacka() {

    }

    void intersect() {

    }
    void toString() {

    }
    void equals() {

    }

    public boolean isNull() {
        return pocetnaTacka == 0 && krajnjaTacka == 0;
    }

}
