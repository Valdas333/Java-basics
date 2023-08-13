package NoodleRestaurant;

class BiangBiang extends Noodle {

    BiangBiang() {

        super(50.0, 5.0, "flat", "high-gluten flour, salt, water");

    }

    @Override
    public String getCookPrep() {

        return "Place the noodle in the boil water, boil until it starts to float, about 2 minutes total.\n" +
                "Serve with sauces, vegetables, or any number of ways.";
    }

}
