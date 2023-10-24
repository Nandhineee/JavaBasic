package I_Exception;

public class I_Execption {
    public static void main(String[] args) {
        try {
            int a = 17 / 0;
            System.out.println(a);
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("error");
            } else {
                System.out.println(e);
            }
        }
    }
}
