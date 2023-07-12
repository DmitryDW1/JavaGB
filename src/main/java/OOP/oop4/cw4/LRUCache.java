package OOP.oop4.cw4;

import java.util.ArrayList;
import java.util.List;

public class LRUCache<E> {
    ArrayList<E> eArrayList;
    int size;

    public ArrayList<E> geteArrayList() {
        return eArrayList;
    }

    public void seteArrayList(ArrayList<E> eArrayList) {
        this.eArrayList = eArrayList;
    }

    public LRUCache(int size) {
        this.size = size;
        eArrayList = new ArrayList<>();
    }

    public LRUCache() {
    }

    public void addElement(E employee) {
        if(this.eArrayList.size() >= size){
            this.eArrayList.remove(0);

        }
        this.eArrayList.add(employee);
    }
    public E getElement(int ind){
        if(ind >= eArrayList.size()){
            return null;
        }
        return this.eArrayList.get(ind);
    }
    public List<E> getAllElement(){
        return this.eArrayList;
    }

}
