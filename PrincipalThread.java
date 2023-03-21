public class PrincipalThread {
    public static void main(String[] args) {
        System.out.println("Número de threads: " + Thread.activeCount());

        System.out.println(Thread.currentThread());
    }
}