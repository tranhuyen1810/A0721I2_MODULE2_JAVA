package bai_4_lop_va_doi_tuong_java.baitap.lop_quadraticequation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;
    double r;
    double r1;
    double r2;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return delta = b * b - 4 * a * c;
    }

    public double getRoot1() {
        return r1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return r2 = (-b - Math.pow(delta, 0.5)) / 2 * a;
    }

    public double getRoot() {
        return r = -b / 2 * a;
    }
}
