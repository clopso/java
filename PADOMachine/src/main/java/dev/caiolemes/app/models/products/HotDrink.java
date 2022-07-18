package dev.caiolemes.app.models.products;

public abstract class HotDrink {
    private Integer quantity;
    private Integer temperature;
    private Integer sugar;

    public HotDrink(int quantity, int temperature, int sugar) {
        this.quantity = quantity;
        this.temperature = temperature;
        this.sugar = sugar;
    }

    public HotDrink() {}


    public HotDrink(HotDrink.DefaultDrink defaultDrink) {
        this.quantity = defaultDrink.getQuantity();
        this.temperature = defaultDrink.getTemperature();
        this.sugar = defaultDrink.getSugar();
    }

    public static class DefaultDrink extends HotDrink{
        public DefaultDrink(int quantity, int temperature, int sugar) {
            this.setQuantity(quantity);
            this.setTemperature(temperature);
            this.setSugar(sugar);
        }
    }

    protected int getQuantity() {
        return quantity;
    }

    protected int getTemperature() {
        return temperature;
    }

    protected int getSugar() {
        return sugar;
    }

    protected void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    protected void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    protected void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "{" +
                "\"quantity\":" + this.getQuantity() +
                ", \"temperature\":" + this.getTemperature() +
                ", \"sugar\":" + this.getSugar() +
                "}";
    }
}
