import java.io.*;

public class RandomAccessRevisi {
    public static void main(String[] args) {
        String bookList[] = {"Satu", "Dua", "Tiga"};
        int yearList[] = {1920, 1230, 1940};

        try (RandomAccessFile books = new RandomAccessFile("books.txt", "rw")) {
            for (int i = 0; i < 3; i++) {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }
            books.seek(0);
            System.out.println(books.readUTF() + " " + books.readInt());
            System.out.println(books.readUTF() + " " + books.readInt());
        } catch (IOException e) {
            System.out.println("Indeks melebihi batas atau ada masalah IO");
        } finally {
            System.out.println("Selesai");
        }
    }
}
