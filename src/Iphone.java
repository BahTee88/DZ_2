public class Iphone extends CellPhone implements Printable{
    private int memory;
    private String displayTypes;

    public Iphone(String name, String model, int year, int memory, String displayTypes) {
        super(name, model, year);
        this.memory = memory;
        this.displayTypes = displayTypes;
    }

    public int getMemory() {
        return memory;
    }

    public String getDisplayTypes() {
        return displayTypes;
    }

    @Override
    public void print() {
        System.out.println(getInfo()  +" Memory:"  + getMemory() +
                " DisplayTypes:"  +  getDisplayTypes());

    }
}
