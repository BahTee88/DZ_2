public class Redmi extends CellPhone implements Printable{

    private double size;

    private String color;

    public Redmi(String name, String model, int year, double size , String color) {
        super(name, model, year);
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println(getInfo()   +  " Size:"+ getSize() +
                "Color:"  +  getColor());

    }
}
