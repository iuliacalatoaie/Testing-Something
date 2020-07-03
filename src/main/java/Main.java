public class Main {
    public static void main(String[] args) {
        Cat grumpyCat = new Cat("Tardar Sauce");

        grumpyCat.setAge(2);
        System.out.println(grumpyCat.toString());
        grumpyCat.purr();
    }
}
