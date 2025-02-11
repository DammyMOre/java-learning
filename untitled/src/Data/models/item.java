package Data.models;

public class item {
    private int id;
    private String name;
    private String description;
    private int weightInGrams;
   private Reciever reciever;
    private Sender sender;
    private TrackingInfo trackingInfo;

    public item(int id, String name, String description,
                int weightInGrams, TrackingInfo trackingInfo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weightInGrams = weightInGrams;
        this.trackingInfo = trackingInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public TrackingInfo getTrackingInfo() {
        return trackingInfo;
    }

    public void setTrackingInfo(TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }




}
