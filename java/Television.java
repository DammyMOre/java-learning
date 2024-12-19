public class Television{

private int volume = 1;
private boolean isOn = false;
private String name;
private int channel =1;



public void increaseVolume(){
if(volume >=1 && volume<10){
volume++;
}
}

public void decreaseVolume(){
if(volume <= 10 && volume >=1){
volume--;
}
}


public int getVolume(){
return volume;
}

public void changeChannelUpward(){
if(channel >1 && channel<120){
channel++;
}
}

public void changeChannelDownward(){
if(channel <= 120 && channel >=1){
channel--;
}
}


public int getChannel(){
return channel;
}



public void turnOn(){
isOn = true;
}

public void turnOff(){
isOn = false;
}

public boolean getIsOn(){
return isOn;

}

public void setName(String name){
this.name = name;

}

public String getName(){
return name;
}




}

