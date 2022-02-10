package assignment;

import java.util.Arrays;

public class MyList {
    private boolean isEmpty;
    private String [] myList = new String[2];

    public  boolean isEmpty() {
        isEmpty = true;
        return isEmpty;
    }

    public void add(String item) {
        for(int i = 0; i < myList.length; i++){
            if(myList[i] == null){
                myList[i] = item;
                break;
            }
        }
//        Arrays.fill(myList,item);

    }

    public String[] getMyOwnList() {
        return myList;
    }


    public int size() {
        int count = 0;
        for(int i =0; i< myList.length; i++){
            if(myList[i] !=(null)){
                count++;
            }
        }
        return count;
    }
}


