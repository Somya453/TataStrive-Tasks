package Tasks;

public class ThrowException {

    static void check(int n) throws Exception {
        if (n % 2 != 0) {
            throw new Exception("Number is Odd");
        }
        System.out.println("Number is Even");
    }

    public static void main(String[] args) {
        try {
            check(7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
