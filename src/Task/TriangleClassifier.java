package Task;

public class TriangleClassifier {
    public static void main(String[] args) {
        // Triangles classify by side lengths: equilateral (all sides equal), isosceles (two sides equal),
        // or scalene (all sides different). First validate using the triangle inequality theorem: sum of any two sides must exceed the third.

    int a =2;
    int b = 3;
    int c =3;

    if( a==b && b==c)
    {
        System.out.println("Equilateral Triangle");
    }
    else if(a==b || b==c || c==a)
    {
        System.out.println("Isosceles triangle");
    }
    else
    {
        System.out.println("Scalene Triangle");
    }


    }
}
