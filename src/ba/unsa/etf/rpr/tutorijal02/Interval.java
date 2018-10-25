package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetnaTacka, krajnjaTacka;
    boolean pocetnaPripadaIntervalu, krajnjaPripadaIntervalu;
    public Interval(double pocetnaTacka, double krajnjaTacka, boolean pocetnaPripadaIntervalu, boolean krajnjaPripadaIntervalu) {
        if(pocetnaTacka>krajnjaTacka) throw new IllegalArgumentException("Pocetna tacka je veca od krajnje!");
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.pocetnaPripadaIntervalu = pocetnaPripadaIntervalu;
        this.krajnjaPripadaIntervalu = krajnjaPripadaIntervalu;
    }
    public Interval() {
        this.pocetnaTacka = 0;
        this.krajnjaTacka = 0;
        this.pocetnaPripadaIntervalu = false;
        this.krajnjaPripadaIntervalu = false;
    }
    public boolean isIn(double a) {
        if(pocetnaPripadaIntervalu) {
            if(krajnjaPripadaIntervalu) {
                return  (a>=pocetnaTacka && a<=krajnjaTacka);
            }
            else return(a>=pocetnaTacka && a<krajnjaTacka);
        }
        else {
            if(krajnjaPripadaIntervalu) {
                return (a>pocetnaTacka && a<=krajnjaTacka);
            }
        }
        return (a>pocetnaTacka && a<krajnjaTacka);
        }

    public boolean isNull() {
        return pocetnaTacka == 0 && krajnjaTacka == 0;
    }
    public Interval intersect(Interval A) {
        double a, b, c, d;
        Interval B = new Interval();
        b = this.krajnjaTacka;
        a = this.pocetnaTacka;
        c = A.pocetnaTacka;
        d = A.krajnjaTacka;
        if ((a < c && a < d && b < c && b < d) || (a > c && a > d && b > c && b > d)) {
            return B;
        } else if (b > c && b > d && d > a && c > a) {
            if (A.pocetnaPripadaIntervalu && A.krajnjaPripadaIntervalu)
                B = new Interval(c, d, true, true);
            else if (A.pocetnaPripadaIntervalu)
                B = new Interval(c, d, true, false);
            else if (A.krajnjaPripadaIntervalu)
                B = new Interval(c, d, false, true);
            else
                B = new Interval(c, d, false, false);
        } else if (a > c && a < d && b > c && b > d) {
            if (this.pocetnaPripadaIntervalu && A.krajnjaPripadaIntervalu)
                B = new Interval(a, d, true, true);
            else if (this.pocetnaPripadaIntervalu)
                B = new Interval(a, d, true, false);
            else if (this.krajnjaPripadaIntervalu)
                B = new Interval(a, d, false, true);
            else
                B = new Interval(a, d, false, false);
        } else if (a < c && c < b && b < d && a < d) {
            if (A.pocetnaPripadaIntervalu && this.krajnjaPripadaIntervalu)
                B = new Interval(c, b, true, true);
            else if (A.pocetnaPripadaIntervalu)
                B = new Interval(c, b, true, false);
            else if (this.krajnjaPripadaIntervalu)
                B = new Interval(c, b, false, true);
            else
                B = new Interval(c, b, false, false);
        } else if (d > a && d > b && c < a && c < b) {
            if (this.pocetnaPripadaIntervalu && this.krajnjaPripadaIntervalu)
                B = new Interval(a, b, true, true);
            else if (this.pocetnaPripadaIntervalu)
                B = new Interval(a, b, true, false);
            else if (this.krajnjaPripadaIntervalu)
                B = new Interval(a, b, false, true);
            else
                B = new Interval(a, b, false, false);
        }
        return B;
    }
    public static Interval intersect(Interval A, Interval B) {
        double a, b, c, d;
        Interval C = new Interval();
        b = A.krajnjaTacka;
        a = A.pocetnaTacka;
        c = B.pocetnaTacka;
        d = B.krajnjaTacka;
        if ((a < c && a < d && b < c && b < d) || (a > c && a > d && b > c && b > d)) {
            return C;
        } else if (b > c && b > d && d > a && c > a) {
            if (B.pocetnaPripadaIntervalu && B.krajnjaPripadaIntervalu)
                C = new Interval(c, d, true, true);
            else if (B.pocetnaPripadaIntervalu)
                C = new Interval(c, d, true, false);
            else if (B.krajnjaPripadaIntervalu)
                C = new Interval(c, d, false, true);
            else
                C = new Interval(c, d, false, false);
        } else if (a > c && a < d && b > c && b > d) {
            if (A.pocetnaPripadaIntervalu && B.krajnjaPripadaIntervalu)
                C = new Interval(a, d, true, true);
            else if (A.pocetnaPripadaIntervalu)
                C = new Interval(a, d, true, false);
            else if (A.krajnjaPripadaIntervalu)
                C = new Interval(a, d, false, true);
            else
                C = new Interval(a, d, false, false);
        } else if (a < c && c < b && b < d && a < d) {
            if (B.pocetnaPripadaIntervalu && A.krajnjaPripadaIntervalu)
                C = new Interval(c, b, true, true);
            else if (B.pocetnaPripadaIntervalu)
                C = new Interval(c, b, true, false);
            else if (A.krajnjaPripadaIntervalu)
                C = new Interval(c, b, false, true);
            else
                C = new Interval(c, b, false, false);
        } else if (d > a && d > b && c < a && c < b) {
            if (A.pocetnaPripadaIntervalu && A.krajnjaPripadaIntervalu)
                C = new Interval(a, b, true, true);
            else if (A.pocetnaPripadaIntervalu)
                C = new Interval(a, b, true, false);
            else if (A.krajnjaPripadaIntervalu)
                C = new Interval(a, b, false, true);
            else
                C = new Interval(a, b, false, false);
        }
        return C;

    }

}
