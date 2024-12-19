package calculations;

public class Radio {
    private String radioName;
    private boolean isOn;
    private int volume;

    public Radio(String radioName, boolean isOn, int volume) {
       this.radioName = radioName;
       this.isOn = isOn;
       this.volume = volume;
    }
    public Radio(){

    }

    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }
    public String getRadioName() {
        return radioName;
    }
}
