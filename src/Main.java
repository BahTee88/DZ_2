public class Main {
    public static void main(String[] args) {

        Printable[] printables = {
                createObject("Iphone"),
                createObject("Samsung"),
                createObject("Redmi")};

        for (Printable printable : printables) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Iphone":
                Iphone iphone = new Iphone("Iphone ","14 Pro",2023,256,"Oled");
                return iphone;
            case "Samsung":
                Samsung samsung = new Samsung("Samsung","S22 Ultra",2022,"MultiTouch","Stereo");
                return samsung;
            case "Redmi":
                Redmi redmi = new Redmi("Redmi", "Redmi Note11", 2021, 6.3, " Black");
                return redmi;

        }
        return null;
    }

}