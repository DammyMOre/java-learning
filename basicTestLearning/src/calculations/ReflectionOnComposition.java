package calculations;

public enum ReflectionOnComposition {
    NORTHCENTRAL ("BENUE","FCT","KOGI","KWARA","NASARAWA","NIGER","PLATEAU"),
    NORTHEAST ("Adamawa","Bauch","Borno","Gombe","Taraba","Yobe"),
    NORTHWEST ("Kaduna","katsina","kano","kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTHEAST("Abia","Anambra","Ebonyi","Enugun","Imo"),
    SOUTHSOUTH ("Akwa-Ibom", "Bayelsa","Cross-Rivers","Delta","Edo","Rivers"),
    SOUTHWEST ("Ekiti","Lagos","Oyo","Ogun","Osun","Ondo");

    private String[] zones;
    ReflectionOnComposition (String ... zones){
        this.zones = zones;
    }

    public void setZones(String[] zones) {
        this.zones = zones;
    }

    public String[] getZones() {
        return zones;
    }
}
