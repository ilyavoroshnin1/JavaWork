package Lesson13;

import java.util.Objects;

public class Moneta {
    private double diametr;
    private double ves;
    private String metall;
    private int nominal;

    public Moneta() {
    }

    public Moneta(double diametr, double ves, String metall, int nominal) {
        this.diametr = diametr;
        this.ves = ves;
        this.metall = metall;
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Moneta{" +
                "diametr=" + diametr +
                ", ves=" + ves +
                ", metall='" + metall + '\'' +
                ", nominal=" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneta moneta = (Moneta) o;
        return Double.compare(moneta.diametr, diametr) == 0 && Double.compare(moneta.ves, ves) == 0 && nominal == moneta.nominal && Objects.equals(metall, moneta.metall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr, ves, metall, nominal);
    }
}
