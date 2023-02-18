public class Main {
    public static void main(String[] args) {
        Person Vasya = new Person("Vasya", "Almaty" );
        Student Kuzya = new Student("Kyzya", "Almaty", "Information System", 20, 3000.0);
        Staff Saul = new Staff("Saul", "USA", "MIT", 300.00);
        System.out.println(Vasya.toString());
        System.out.println(Kuzya.toString());
        System.out.println(Saul.toString());
    }
}