package notSoManyFish;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // write your code here

        ArrayList<String> people = new ArrayList<>(6);
        people.add("Lisa");
        people.add("Sarah");
        people.add("Simon");
        people.add("Michael");
        people.add("Seble");
        people.add("David");

        ArrayList<String >text =new ArrayList<>();
        text.add(" is free Saturday night");
        text.add(" played chess with ");
        text.add(" ");


        Random random = new Random();
        for (int j=1; j<=10; j++) {

            for (int i = 1; i < 6; i++) {
                String name1 = getRandomOne(people);
                String name2 = getRadomTwo(people);
                if (name1.equals(name2)) {
                    System.out.println(name1 + " is free Saturday night ");
                } else {
                    System.out.println(name1 + " asked Sarah out, and " + name2 + "accepted");
                    System.out.println(name1 + " played chess with " + name2);
                    System.out.println(name1 + " visited " + name2);
                    System.out.println(name1 + " went to a meetup with " + name2);
                    System.out.println(name1 + " went to dinner with " + name2);
                    System.out.println(name1 + " tipped over a glass during a date with " + name2);

                }

            }
        }
    }

    public static String getRandomOne(ArrayList<String> people) {

            Random random = new Random();
            int idex = random.nextInt(people.size());
            String rand1 = people.get(idex);
            System.out.println(rand1);
            return people.get(idex);
        }

    public static String getRadomTwo(ArrayList<String> people) {

        Random random = new Random();
        int idex = random.nextInt(people.size());
        String rand1 = people.get(idex);
        System.out.println(rand1);
        return people.get(idex);
    }

}

