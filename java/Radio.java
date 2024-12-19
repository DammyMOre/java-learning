public class Radio{

private int volume = 1;
private boolean isOn = false;
private String name;



public void increaseVolume(){
if(volume >0 && volume<12){
volume++;
}
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


public void decreaseVolume(){
if(volume <= 12 && volume >=1){
volume--;
}
}


public int getVolume(){
return volume;
}



public void setName(String name){
this.name = name;

}

public String getName(){
return name;
}




}

