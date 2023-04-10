public abstract class CellPhone {
    private String name;
    private String model;
    private int  year;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public CellPhone(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public String getInfo() {
        return "Name:" + this.name +
                "Model: "+ this.model +
                "Year: "+ this.year;
    }
    public void print() {
        System.out.println(getInfo());
    }
}
