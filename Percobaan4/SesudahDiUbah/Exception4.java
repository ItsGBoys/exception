public class Exception4 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(bil / 0); // Ini akan menyebabkan ArithmeticException
            System.out.println(b[3]); // Ini tidak akan dieksekusi karena exception sebelumnya
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Melebihi jumlah array");
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
