package AbstrakCinema;

class Main {
    public static void main(String[] args) {
        StandardCinema standardCinema = new StandardCinema(100.0);
        DeluxeCinema deluxeCinema = new DeluxeCinema(100.0);
        PremiumCinema premiumCinema = new PremiumCinema(100.0);
        CinemaMahasiswa mahasiswaCinema = new CinemaMahasiswa(100.0);
        Double adminFeeStan = standardCinema.calculateAdminFee();
        Double adminFeeDel = deluxeCinema.calculateAdminFee();
        Double adminFeePre = premiumCinema.calculateAdminFee();
        Double adminFeeMhsw = mahasiswaCinema.calculateAdminFee();
        System.out.println("Biaya Admin Untuk Standard Cinema : " + adminFeeStan);
        System.out.println("Biaya Admin Untuk Deluxe Cinema : " + adminFeeDel);
        System.out.println("Biaya Admin Untuk Premium Cinema : " + adminFeePre);
        System.out.println("Biaya Admin Untuk Mahasiswa Cinema : " + adminFeeMhsw);
    }
}
