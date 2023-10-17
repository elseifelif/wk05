public class MobilePhone extends Product {
    private String memory;
    private String mobilePhoneScreen;
    private String batteryPower;
    private String ram;
    private String color;

    public MobilePhone(int uniqueProductNumber, double productPrice,
                       double productDiscountRate, int productStock,
                       String productName, String brandName,
                       String memory, String mobilePhoneScreen,
                       String batteryPower, String ram, String color) {
        super(uniqueProductNumber, productPrice, productDiscountRate,
                productStock, productName, brandName);
        this.memory = memory;
        this.mobilePhoneScreen = mobilePhoneScreen;
        this.batteryPower = batteryPower;
        this.ram=ram;
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMobilePhoneScreen() {
        return mobilePhoneScreen;
    }

    public void setMobilePhoneScreen(String mobilePhoneScreen) {
        this.mobilePhoneScreen = mobilePhoneScreen;
    }

    public String getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(String batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
