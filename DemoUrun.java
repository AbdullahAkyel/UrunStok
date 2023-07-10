import java.util.Scanner;

class DemoUrun {
    private Urun[] urunListesi;
    private int girilenUrunSayisi;

    public void baslikYazdir() {
        System.out.println("*********************************************");
        System.out.println("*** STOK ÜRÜN GİRİŞ VE SORGULAMA PROGRAMI ***");
        System.out.println("*********************************************");
    }

    public void menuYazdir() {
        System.out.println("MENÜ:");
        System.out.println("(1) Ürün gir");
        System.out.println("(2) Ürün sorgula");
        System.out.println("(3) Ürün listesi sıfırla");
        System.out.println("(4) Programı sonlandır");
    }

    public void menuUrunSec() {
        System.out.println("    (1) Cep Telefonu");
        System.out.println("    (2) Fotoğraf Makinesi");
    }

    public void urunListesiSifirla() {
        urunListesi = null;
        girilenUrunSayisi = 0;
    }

    public static void main(String[] args) {
        DemoUrun demoUrun = new DemoUrun();
        Scanner scanner = new Scanner(System.in);
        demoUrun.baslikYazdir();
        System.out.print("Stoka girilecek ürün sayısı: ");
        demoUrun.urunListesi = new Urun[scanner.nextInt()];

        int secim;

        while (true) {
            demoUrun.menuYazdir();
            System.out.print("İşlem seçiniz: ");
            secim = scanner.nextInt();
            System.out.println("----------------");
            

            if (secim >= 1 && secim <= 4) {
                switch (secim) {
                    case 1:
                        if (demoUrun.girilenUrunSayisi >= demoUrun.urunListesi.length) {
                            System.out.println("    Maksimum ürün sayısı: " + demoUrun.urunListesi.length);
                            System.out.println("    Girilen ürün sayısı: " + demoUrun.girilenUrunSayisi);
                            System.out.println("    Yeni ürün girilemez!");
                            break;
                        } else {
                            System.out.println("    Ürün Girişi");
                            demoUrun.menuUrunSec();
                            System.out.println("");
                            System.out.print("    Ürün seçiniz: ");
                            int urunSecim = scanner.nextInt();

                            if (urunSecim == 1) {
                                if (demoUrun.urunListesi == null
                                        || demoUrun.girilenUrunSayisi < demoUrun.urunListesi.length) {
                                    CepTelefonu cepTelefonu = new CepTelefonu();
                                    demoUrun.urunListesi[demoUrun.girilenUrunSayisi] = cepTelefonu;
                                    demoUrun.girilenUrunSayisi++;
                                    cepTelefonu.urunGir(cepTelefonu);
                                }
                            } else if (urunSecim == 2) {
                                if (demoUrun.urunListesi == null
                                        || demoUrun.girilenUrunSayisi < demoUrun.urunListesi.length) {
                                    FotografMakinesi fotografMakinesi = new FotografMakinesi();
                                    demoUrun.urunListesi[demoUrun.girilenUrunSayisi] = fotografMakinesi;
                                    demoUrun.girilenUrunSayisi++;
                                    fotografMakinesi.urunGir(fotografMakinesi);
                                }
                            } else {
                                System.out.println("    Ürün seçimi için 1 ya da 2 değerini giriniz!");
                            }

                            break;
                        }

                    case 2:
                        System.out.println("    Ürün Sorgulama");
                        demoUrun.menuUrunSec();
                        System.out.println("");
                        System.out.print("    Ürün seçiniz: ");
                        int urunSorguSecim = scanner.nextInt();
                        System.out.println("    ---------------------------");
                        

                        if (urunSorguSecim == 1) {
                            boolean cepTelefonuVar = false;

                            for (Urun urun : demoUrun.urunListesi) {
                                if (urun instanceof CepTelefonu) {
                                    cepTelefonuVar = true;
                                    urun.urunSorgula(urun);
                                }
                            }

                            if (!cepTelefonuVar) {
                                System.out.println("    Ürün listesinde cep telefonu bulunamadı!");
                            }
                        } else if (urunSorguSecim == 2) {
                            boolean fotografMakinesiVar = false;

                            for (Urun urun : demoUrun.urunListesi) {
                                if (urun instanceof FotografMakinesi) {
                                    fotografMakinesiVar = true;
                                    urun.urunSorgula(urun);
                                }
                            }

                            if (!fotografMakinesiVar) {
                                System.out.println("    Ürün listesinde fotoğraf makinesi bulunamadı!");
                            }
                        } else {
                            System.out.println("    Ürün seçimi için 1 ya da 2 değerini giriniz!");
                        }

                        break;
                    case 3:
                        System.out.println("    Ürün listesi sıfırlandı!");
                        demoUrun.urunListesiSifirla();
                        System.out.print("    Stoka girilecek ürün sayısı: ");
                        demoUrun.urunListesi = new Urun[scanner.nextInt()];
                        break;
                    case 4:
                        System.out.println("    Program sonlandırıldı!");
                        System.exit(0);
                        break;
                }
            } else {
                System.out.println("İşlem seçimi için 1 ve 4 arasında bir sayı giriniz!");
            }   
        }
    }
}