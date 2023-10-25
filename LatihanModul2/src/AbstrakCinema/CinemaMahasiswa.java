package AbstrakCinema;

class CinemaMahasiswa extends Cinema {
    public CinemaMahasiswa(double price) {
        this.price = price;
    }

    Double calculateAdminFee() {
        return price * 5 / 100;
    }
}
