public class Lesson6_2Test {
    public static void main(String[] args) {
        Lesson6_1 t = new Lesson6_1();
        Lesson6_1 t1 = new Lesson6_1( 3,  5,  4);
        System.out.println("Perimetr="+t.getPerimeter());
        System.out.println(t.getMultiplyPerimetr(3));
//        t.a=3;
//        t.b=5;
//        t.c=4;//длина стороны треугольника
        System.out.println("a=" + t.a);
        System.out.println("b=" + t.b);
        System.out.println("c=" + t.c);
        System.out.println(t.toString());
    }
}
