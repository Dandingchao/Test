import pojo.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Cat> list=new ArrayList<>();
        Cat cat=new Cat();
        list.add(cat);
        ArrayList<Cat> newList =new ArrayList<Cat>();
        newList= (ArrayList<Cat>) list.stream().filter(b->eaaa(b)).collect(Collectors.toList());
        System.out.println(newList.size());
    }

    public static boolean eaaa(Cat cat){
        if (cat.getName()=="hi"){
            return true;
        }
        return false;
    }
}
