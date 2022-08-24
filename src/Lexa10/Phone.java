package Lexa10;

import java.util.ArrayList;
import java.util.Objects;

public class Phone {
    private double diagonal;
    private String processor;
    private int yadro;
    private String model;
    private String proizvoditel;

    public Phone() {
    }

    public Phone(double diagonal, String processor, int yadro, String model, String proizvoditel) {
        this.diagonal = diagonal;
        this.processor = processor;
        this.yadro = yadro;
        this.model = model;
        this.proizvoditel = proizvoditel;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getYadro() {
        return yadro;
    }

    public void setYadro(int yadro) {
        this.yadro = yadro;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    @Override
    public String toString() {
        return proizvoditel + " " + model + " " + yadro + " ядер, диагональ " + diagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.diagonal, diagonal) == 0 &&
                yadro == phone.yadro && Objects.equals(processor, phone.processor) &&
                Objects.equals(model, phone.model) && Objects.equals(proizvoditel, phone.proizvoditel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagonal, processor, yadro, model, proizvoditel);
    }
}
