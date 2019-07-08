package Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Human{
    private int id;
    private String name;

    public Human(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;

    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String toString(){
        return "ID: "+id+"; name: "+name;
    }
}

class StringLenghtComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        int len1 = o1.length();
        int len2 = o2.length();

        if(len1>len2){
            return 1;
        }
        else if(len1<len2){
            return -1;
        }
        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

      return o2.compareTo(o1);
    }
}


public class SortingLists {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>();
        System.out.println("Sorting animals");
        animals.add("cat");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("cheetah");

        Collections.sort(animals, new ReverseAlphabeticalComparator());

        for(String animal: animals){
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Sorting numbers");
        List<Integer> numbers = new ArrayList<>();


        numbers.add(3);
        numbers.add(52);
        numbers.add(325);
        numbers.add(62);
        numbers.add(2);
        numbers.add(112);
        numbers.add(552);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return -o1.compareTo(o2);
            }
        });
        for(Integer number: numbers){
            System.out.println(number);
        }

        List<Human> people = new ArrayList<Human>();

        people.add(new Human(1,"Joe"));
        people.add(new Human(3,"Sue"));
        people.add(new Human(5,"Mark"));
        people.add(new Human(4,"Clare"));
        people.add(new Human(2,"Mike"));

        Collections.sort(people, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Human human: people){
            System.out.println(human);
        }
    }

}
