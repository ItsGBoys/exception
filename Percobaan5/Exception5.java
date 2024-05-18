public class Exception5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0); // Ini akan menyebabkan ArithmeticException
        } catch (ArithmeticException e) {
            // Menangkap dan menangani ArithmeticException
            System.out.println("Pesan error: ");
            System.out.println(e.getMessage()); // Menampilkan pesan error
            System.out.println("Info stack erase");
            e.printStackTrace(); // Menampilkan stack trace error ke konsol
            e.printStackTrace(System.out); // Menampilkan stack trace error ke output standar
        } catch (Exception e) {
            // Menangkap dan menangani semua jenis Exception lainnya
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
