package org.example.equalsHashCode;

public class EqualsHashCodeDemoTest {
    public static void main(String[] args) {
        Adress  adress = new Adress();
        adress.area="pulletikurru";
        adress.houseNo="5-96";
        adress.pinCode="533239";
        adress.state="AP";
        adress.street="Gandi center";
        Adress adress1=null;
        System.out.println(adress.equals(adress));

        Adress  x = new Adress();
        x.area="pulletikurru";
        x.houseNo="5-96";
        x.pinCode="533239";
        x.state="AP";
        x.street="Gandi center";

        Adress  y = new Adress();
        y.area="pulletikurru";
        y.houseNo="5-96";
        y.pinCode="533239";
        y.state="AP";
        y.street="Gandi center";
//        System.out.println(x.area.equals(y.area) && x.houseNo.equals(y.houseNo)
//                && x.pinCode.equals(y.pinCode) && x.street.equals(y.street) && x.state.equals(y.state));
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));

    }


}
