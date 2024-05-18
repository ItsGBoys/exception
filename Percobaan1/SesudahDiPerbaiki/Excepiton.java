public class Exception {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100; // Ini akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi pelanggaran memory: " + e);
        }
    }
}
