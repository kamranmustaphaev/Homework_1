public class Main {
    public static void main(String[] args) {
//        Процедура
        print(777, 0.777);
        sum(333.333, 444.444);
        Human human = new Human("Kamran", 32 );
        System.out.println("name = " + human.getName() + " age = " + human.getAge());
        human.setAge(25);
        System.out.println(" а хотелось бы " + human.getAge());
    }
    static void print(int a, double b){
        System.out.println(a + b);
    }
//          Функция
    static double sum(double a, double b){
        return a+b;
    }
}