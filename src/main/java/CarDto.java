public class CarDto {

    private String brand;
    private int doors;
    private double amount;
    private String base;
//        private List<String> rates;

    public String getBrand() {
        return brand;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

//        public List<String> getRates() {
//            return rates;
//        }
//
//        public void setRates(List<String> rates) {
//            this.rates = rates;
//        }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", doors=" + doors +
                ", amount=" + amount +
                ", base='" + base + '\'' +
                '}';
    }
}


