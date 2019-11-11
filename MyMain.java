import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0,"red");
        double square;
        square=circle.getArea();
        System.out.println(circle.toString());
        System.out.println("Square of the circle: " + square);
        System.out.println();

        Rectangle rectangle = new Rectangle(1.0f,1.0f);
        double sq;
        double p;
        System.out.println(rectangle.toString());
        sq=rectangle.getArea();
        p=rectangle.getPerimetr();
        System.out.println("Rectangle - square: " + sq + ", perimetr: "+ p);
        System.out.println();

        Employee emp = new Employee(1,"Ivan","Ivanov",30000);
        System.out.println(emp.toString());
        System.out.println("Annual Salary: "+emp.getAnnualSalary());
        System.out.println("Raise Salary: "+emp.raiseSalary(10));
        System.out.println();

        Author auth1 = new Author("Stiven Hawking","123@mail.ru",'m');
        Author auth2 = new Author("Lucy Hawking","12345@mail.ru",'f');
        Author[] arrAuth = {auth1,auth2};
        Book book = new Book("George and big bang",arrAuth,100,2);//"Lucy Hawking"
        System.out.println(book.toString());
        System.out.println(Arrays.toString(arrAuth));
        System.out.println();

        MyPoint myP =new MyPoint(0,0);
        MyPoint m =new MyPoint(1,1);
        System.out.println(myP.toString());
        System.out.println("Distance: " + myP.distance(m));
        System.out.println();
        MyPoint myP1 =new MyPoint(0,2);
        MyPoint myP2 =new MyPoint(2,0);

        MyTriangle myT = new MyTriangle(myP,myP1,myP2);
        System.out.println(myT.toString());
        System.out.println("Perimetr: "+myT.getPerimetr());
        System.out.println("Type of the triangle: " +myT.getType());

    }
}
