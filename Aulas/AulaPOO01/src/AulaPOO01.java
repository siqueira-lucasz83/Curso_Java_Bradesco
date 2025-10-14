// Aula básica de POO
public class AulaPOO01 {
    public static void main(String[] args) {
        var male = new Person ("Lucas");
        male.setAge(19);
        var female = new Person("Clara");
        female.setAge(20);
        System.out.println("female name: " + female.getName() + " age: " + female.getAge());
        System.out.println("male name: " + male.getName() + " age: " + male.getAge());
    }
}
