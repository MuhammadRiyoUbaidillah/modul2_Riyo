package tugasmdl2;
//subclass
public class Vcdoke extends vcdku{
    String aktor,sutradara, kategori;
    
    //consruktor
    Vcdoke(String aktor, String sutradara, String kategori, String judul, String publisher, int stok){
        super(judul,publisher,stok);
        this.aktor=aktor;
        this.sutradara=sutradara;
        this.kategori=kategori;
    }
    //overloading construktor
    Vcdoke(){
        
    }
}
