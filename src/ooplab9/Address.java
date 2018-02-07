package ooplab9;

public class Address {
    private String homeno;
    private String province;
    private String postcode;



    public Address(String homeno, String province, String postcode) {
        this.homeno = homeno;
        this.province = province;
        this.postcode = postcode;
            }

    @Override
    public String toString() {
        return "Address{" +
                "homeno='" + homeno + '\'' +
                ", province='" + province + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    public String getHomeno() {
        return homeno;
    }

    public void setHomeno(String homeno) {
        this.homeno = homeno;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
