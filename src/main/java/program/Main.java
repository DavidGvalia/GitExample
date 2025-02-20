package program;

public class Main {
    public static void main(String[] args) {
        String message = "Hello!";
        System.out.println(message);
        int x = 200;
        int y = 5;
        int z = x+y;
        System.out.println(z);
    }
    public void method(){
        System.out.println("Привет из удаленки!");
    }
    public int sum(int x, int y){
        return x + y;
    }
    public void message(){
        System.out.println("Мы в методе main");
    }
}
