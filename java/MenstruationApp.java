/* 
CLASS DIAGRAM

MenstruationApp

- Last menstrualFlow
- menstrualCircle length
- ovualationPeriod
- nextMenstrualFlow

+ calculateSafePeriod
+ calculateOvulationPeriod
+ calculateStartOfNextPeriod

**/


import java.time.LocalDate;
public class MenstruationApp{

private LocalDate lastMenstrualFlow;
private int menstrualCircleLength;
private LocalDate flowDate;
private int ovulationPeriod;
private LocalDate safePeriod;
//private int fertileWindow;
//private String nextMenstrualFlow;



public void lastStartDate(LocalDate date){
this.lastMenstrualFlow = date;
}

public LocalDate getStartDate(){
return lastMenstrualFlow;
}

public void calculateMenstrualCircleLength(int menstrualCircleLength){
this.menstrualCircleLength = menstrualCircleLength;

if(menstrualCircleLength < 21 || menstrualCircleLength > 35)System.out.print("Urgent Medical Attention is needed, please consult your Doctor");

}

public int getMenstrualCircleLength(){
return menstrualCircleLength;
}

public void calculateOvulationPeriod(){

ovulationPeriod = menstrualCircleLength/2;

if(menstrualCircleLength % 2 !=0){
ovulationPeriod = (menstrualCircleLength/2)+1;
}
}

public int getOvulationPeriod(){
return ovulationPeriod;
}

public void setflowDate(int flowRange){
flowDate = this.lastMenstrualFlow.plusDays(flowRange);

}
public LocalDate getFlowDate(){
return flowDate;
}

public void setSafePeriod(){

safePeriod = this.flowDate.plusDays(3);
}

public LocalDate getSafePeriod(){
return safePeriod;
}




/*
public void setFertileWindow(int ovulationPeriod){
this.ovulationPeriod = ovulationPeriod;
fertileWindow = (ovulationPeriod - 6); 

}

public int getFertileWindow(){
return fertileWindow;
}


public int setSafePeriod(){
safePeriod = (startDate + flowRange) + 3;


}

**/





}
















