package Functions;

public class BasicMethodCall {
    public static void shreysh(){
        karan();
        System.out.println("khushi");
    }

    static void main() {
       shravan();
    }
    public static void karan(){
        System.out.println("yashika");
    }
    public static void shravan(){
        karan();
        shreysh();
        System.out.println("Ajay");
        shreysh();
    }
}
