package tugasmdl2;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        int pilih,repeat;

        do{     
           //membuat objek
            Vcdoke vcd = new Vcdoke();

            Scanner inputUser = new Scanner(System.in);
            //objek dipangil dan dieksekusi
            System.out.println(" Selamat Datang Di Ubex Rental VCD ");
            System.out.println(" ");
            System.out.print(" Silahkan Masukkan Judul     : ");
            vcd.judul=inputUser.nextLine();
            System.out.print(" Silahkan Masukkan Publisher : ");
            vcd.publisher=inputUser.nextLine();
            System.out.print("Silahkan Masukkan Aktor      : ");
            vcd.aktor=inputUser.nextLine();
            System.out.print("Silahkan Masukkan Sutradara  : ");
            vcd.sutradara=inputUser.nextLine();
            
            System.out.println("           Kategori Orang");
            System.out.println("1. Semua Umur\n2. Dewasa\n3. Remaja\n4. Anak-Anak");
            System.out.print("Pilih nomer berapa?   : ");
            pilih=inputUser.nextInt();
            
            switch(pilih){
                case 1:
                    vcd.kategori="Semua Umur";
                    break;
                case 2:
                    vcd.kategori="Dewasa";
                    break;
                case 3:
                    vcd.kategori="Remaja";
                    break;
                case 4:
                    vcd.kategori="Anak-Anak";
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada Di Menu Rental silahkan memulai program kembali ");
                    return;
            }
            System.out.print("Stok                   : ");
            vcd.stok=inputUser.nextInt();
            System.out.println("+++++  INFO DAFTAR RENTAL VCD ++++++ ");
            System.out.println("==============================");
            
            System.out.println("Judul Film          : "+vcd.judul);
            System.out.println("Sutradara           : "+vcd.sutradara);
            System.out.println("Aktor Film          : "+vcd.aktor);
            System.out.println("Publisher           : "+vcd.publisher);
            System.out.println("Kategori            : "+vcd.kategori);
            System.out.println("Jumlah Stok         : "+vcd.stok);
            
            System.out.println("\n");
            System.out.println("Ingin Mengulang Kembali?\nIya[1] atau Tidak [2]");
            System.out.print("Silahkan Memilih? : ");
            repeat=inputUser.nextInt();
            }while(repeat<2);
        System.out.println("Terima Kasih sudah rental VCD ");
    }
    
}

    
