public class Person {
    private String name;
    private double age;
    private double height;

    public Person(double age, double height) {
        this.age = age;
        this.height = height;
        Person adam = new Person();
        adam.checkHeight();
    }

    public String getPerson() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void checkAge() {
        if (this.age > 30) {
            System.out.println("User is older than 30");
        } else {
            System.out.println("User is 30 (or younger)");
        }
    }

    public void checkHeight() {
        if (this.height > 160) {
            System.out.println("User is taller then 160");
        } else {
            System.out.println("user is 160 (or shorter");
        }
    }
}
