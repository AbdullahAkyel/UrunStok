import java.util.Scanner;

class CepTelefonu extends Urun {
    private int ekranYenilemeHizi;
    private int bellekKapasitesi;
    private int kameraCozunurluk;

    public void setEkranYenilemeHizi(int ekranYenilemeHizi) {
        this.ekranYenilemeHizi = ekranYenilemeHizi;
    }

    public void setBellekKapasitesi(int bellekKapasitesi) {
        this.bellekKapasitesi = bellekKapasitesi;
    }

    public void setKameraCozunurluk(int kameraCozunurluk) {
        this.kameraCozunurluk = kameraCozunurluk;
    }

    public int getEkranYenilemeHizi() {
        return ekranYenilemeHizi;
    }

    public int getBellekKapasitesi() {
        return bellekKapasitesi;
    }

    public int getKameraCozunurluk() {
        return kameraCozunurluk;
    }

    @Override
    public Object urunGir(Object urun) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("    Marka giriniz: ");
        String marka = scanner.nextLine();
        setMarka(marka);

        System.out.print("    Ekran yenileme hızı giriniz (Hz): ");
        int ekranYenilemeHizi = scanner.nextInt();
        setEkranYenilemeHizi(ekranYenilemeHizi);

        System.out.print("    Bellek kapasitesi giriniz (GB): ");
        int bellekKapasitesi = scanner.nextInt();
        setBellekKapasitesi(bellekKapasitesi);

        System.out.print("    Kamera çözünürlüğü giriniz (MP): ");
        int kameraCozunurluk = scanner.nextInt();
        setKameraCozunurluk(kameraCozunurluk);

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
        CepTelefonu cepTelefonu = (CepTelefonu) urun;

        System.out.println("    Marka: " + cepTelefonu.getMarka());
        System.out.println("    Ekran yenileme hızı: " + cepTelefonu.getEkranYenilemeHizi() + " Hz");
        System.out.println("    Bellek kapasitesi: " + cepTelefonu.getBellekKapasitesi() + " GB");
        System.out.println("    Kamera çözünürlüğü: " + cepTelefonu.getKameraCozunurluk() + " MP");
        System.out.println("    Fiyat: " + cepTelefonu.getFiyat() + " TL");
        System.out.println("    Adet: " + cepTelefonu.getAdet());
        System.out.println("    ---------------------------");
    }
}