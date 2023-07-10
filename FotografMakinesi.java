import java.util.Scanner;

class FotografMakinesi extends Urun {
    private int dijitalZoom;
    private int optikZoom;

    public void setDijitalZoom(int dijitalZoom) {
        this.dijitalZoom = dijitalZoom;
    }

    public void setOptikZoom(int optikZoom) {
        this.optikZoom = optikZoom;
    }

    public int getDijitalZoom() {
        return dijitalZoom;
    }

    public int getOptikZoom() {
        return optikZoom;
    }

    @Override
    public Object urunGir(Object urun) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("    Marka giriniz: ");
        String marka = scanner.nextLine();
        setMarka(marka);

        System.out.print("    Dijital zoom değeri giriniz: ");
        int dijitalZoom = scanner.nextInt();
        setDijitalZoom(dijitalZoom);

        System.out.print("    Optik zoom değeri giriniz: ");
        int optikZoom = scanner.nextInt();
        setOptikZoom(optikZoom);

        System.out.print("    Fiyat giriniz (TL): ");
        double fiyat = scanner.nextDouble();
        setFiyat(fiyat);

        System.out.print("    Adet giriniz: ");
        int adet = scanner.nextInt();
        setAdet(adet);
        
        return this;
    }

    @Override
    public void urunSorgula(Object urun) {
        FotografMakinesi fotografMakinesi = (FotografMakinesi) urun;

        System.out.println("    Marka: " + fotografMakinesi.getMarka());
        System.out.println("    Dijital zoom: " + fotografMakinesi.getDijitalZoom() + "X");
        System.out.println("    Optik zoom: " + fotografMakinesi.getOptikZoom() + "X");
        System.out.println("    Fiyat: " + fotografMakinesi.getFiyat() + " TL");
        System.out.println("    Adet: " + fotografMakinesi.getAdet());
        System.out.println("    ---------------------------");
    }
}