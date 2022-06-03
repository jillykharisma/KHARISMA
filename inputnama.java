import java.util.Scanner;

public class inputnama {
    public static void main(String[] args) {

        // membust array input nama
        String[] nama = new String[2];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for (int i = 0; i < nama.length; ++){
            System.out.println("Nama ke-" + i + ": ");
            nama[i] = scan.nextLine();
        }
        System.out.println("________________")

        // menampilkan semua isi array;
        for( String N = nama){
            System.out.println(nama);
        }

    }
}
