package exercises.interfake;

import java.util.ArrayList;

public class Rabotyga {
    public Rabotyga() {
    }
    public static void DoSwitchPower(ArrayList<IPowerSwitch> tvs) {
        for (int i = 0; i < tvs.size(); i++) {
            tvs.get(i).powerOff();
            tvs.get(i).powerOn();
            tvs.get(i).powerOn();
            tvs.get(i).powerOff();
        }
    }
}


//    }
//
//        public static ArrayList<TV> getNameTV23 =  new ArrayList<TV>(); {
//            ArrayList<String> strTV = new ArrayList<String>();
//            System.out.println(strTV);


//        listTV (String[] args) {


//        TV listik = new TV (setNameTV()) ;








