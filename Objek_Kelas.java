public class Class {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga (1, 1, 1);
        Segitiga segitiga2 = new Segitiga (30, 10, 90);
        Segitiga segitiga3 = new Segitiga (20, 30, 60);
        
        double luasSegitiga1 = segitiga1.getLuas();
        double kelilingSegitiga1 = segitiga1.getKeliling();
        double luasSegitiga2 = segitiga2.getLuas();
        double kelilingSegitiga2 = segitiga2.getKeliling();
        double luasSegitiga3 = segitiga3.getLuas();
        double kelilingSegitiga3= segitiga3.getKeliling();
        
        System.out.println("Segitiga 1 :");
        System.out.println("Luas: " + luasSegitiga1);
        System.out.println("Keliling: " + kelilingSegitiga1);
        
        System.out.println("\nSegitiga 2 :");
        System.out.println("Luas: " + luasSegitiga2);
        System.out.println("Keliling: " + kelilingSegitiga2);
        
        System.out.println("\nSegitiga 3 :");
        System.out.println("Luas: " + luasSegitiga3);
        System.out.println("Keliling: " + kelilingSegitiga3);
        
    }
    
}

class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;
    
    public Segitiga(){
    }
    
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru){
        this.alas = alasBaru;
        this.tinggi = tinggiBaru;
        this.sisi = sisiBaru;
    }
    
    public double getLuas(){
        return(alas * tinggi)/2;
    }
    
    public double getKeliling(){
        return alas + tinggi + sisi;
    }
    
    public void setAlas(double alasBaru){
        this.alas = alasBaru;
    }
    
    public void setTinggi(double tinggiBaru){
        this.tinggi = tinggiBaru;
    }
    
    public void setSisi(double sisiBaru){
        this.sisi = sisiBaru;
    }
    
    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisi() {
        return sisi;
    }
}
