package Beans;

import Model.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TimeHandler {

    private Time time;
    private final List<Time> timeList = new ArrayList<Time>();

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public List<Time> getTimeList() {
        return timeList;
    }


    public void loadTimes() {
        timeList.clear();
        Time temp = new Time();
        temp.setName("brasao-vasco-1383013201926_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-sport-1383081509432_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-sao-paulo-1383012783800_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-santos-1383012712997_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-ponte-preta-1383013043294_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-palmeiras-1383081365846_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-joinville-1383081323459_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-inter-1383012732937_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-gremio-1383012821050_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-goias-1383012842853_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-fluminense-1384196872174_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-flamengo-1383013182930_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-figueirense-1383081262573_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-cruzeiro-1383012800767_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-coritiba-1383013134670_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-corinthians-1383013079679_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-chapecoense-1383081240819_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-avai-1383080947570_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-atletico-pr-1383012934593_80x80");
        timeList.add(temp);
        timeList.add(temp);
        temp = new Time();
        temp.setName("brasao-atletico-mg-1383012954563_80x80");
        timeList.add(temp);
        timeList.add(temp);
        embaralharTimes();
    }
    public void embaralharTimes(){
        Collections.shuffle(timeList);
    }

    public void timeSlecionado(Time time){
        System.out.println(time.getName());
    }
}
