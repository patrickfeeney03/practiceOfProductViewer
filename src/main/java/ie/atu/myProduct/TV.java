package ie.atu.myProduct;

public class TV extends Product{
    private Integer screenSize;
    private String manufacture;

    public TV() {
        super();
        screenSize = 0;
        manufacture = "";
        count++;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " made by " + manufacture + ". Size: " + screenSize;
    }
}
