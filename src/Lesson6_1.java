public class Lesson6_1 {
    public double a;
    public double b;
    public double c;
    public double coeficent;

    public Lesson6_1() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
        this.incrementA();
    }

    @Override
    public String toString() {
        return "Lesson6_1{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", coeficent=" + coeficent +
                '}';
    }

    public Lesson6_1(double a, double b, double c) {
        this.a = a;//
        this.b = b;// КОНСТРУКТОР
        this.c = c;//
    }


    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public double getMultiplyPerimetr(int coeficent) {
        this.coeficent = coeficent;
        return getPerimeter() * coeficent;
    }

    public double getPerimetr() {
        return this.a + this.b + this.c;
    }

    private void incrementA() {
        this.b++;
        this.c++;
        this.a++;
    }
}

