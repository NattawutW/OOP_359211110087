package ooplab7;

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;

    public SuperCar() {
    }

    //Constructor by own
    public SuperCar(String id, String n, String a, String g) {
        //assign data to properties
        this.carbrand = carbrand;
        this.carcolor = carcolor;
        this.carenginesize =carenginesize;
        this.maxspeed = maxspeed;
        this.countryoforigin = countryoforigin;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "carbrand='" + carbrand + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", carenginesize='" + carenginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countryoforigin='" + countryoforigin + '\'' +
                '}';
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }
}//class
