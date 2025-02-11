package Data.repositories;

import Data.models.item;

import java.util.ArrayList;

public class items {
    private int count;
    private ArrayList<item> items = new ArrayList<>();


    public long count(){
        return items.size();
    }
    public item save(item item){
        items.add(item);
        return item;
    }
//    public <Item> Item [] saveAll(ArrayList<Item> items){
////        this.item.addAll(item);
//
//
//    }


}
