public class Samsung extends CellPhone implements Printable{

    private String sensor;

    private String speaker;

    public Samsung(String name, String model, int year, String sensor, String speaker) {
        super(name, model, year);
        this.sensor = sensor;
        this.speaker = speaker;
    }

    public String getSensor() {
        return sensor;
    }

    public String getSpeaker() {
        return speaker;
    }

    @Override
    public void print() {
        System.out.println(getInfo()  +" Sensor:"  + getSensor() +
            " Speaker:"   +  getSpeaker());
    }
}
