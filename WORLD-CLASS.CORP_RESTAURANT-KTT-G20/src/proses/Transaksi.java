package proses;



public class Transaksi {
    private Integer uangBayar;
    private Integer uangKembalian;
    
    // construktor kosong
    public Transaksi() {
        
    }
    // membuat construktor nama parameter uang
    public Transaksi(int uang) {
        uangBayar = uang;
    }
    
    // membuat fungsi untuk menghitung uang yang di bayarkan customer
    public String pembayaran(int totalHarga) {
        uangKembalian = uangBayar - totalHarga;
        return uangKembalian.toString();
    }
    
    public int getUangKembalian() {
        return uangKembalian;
    }

    public int getUangBayar() {
        return this.uangBayar;
    }

    public void setUangBayar(int uangBayar) {
        this.uangBayar = uangBayar;
    }

}
