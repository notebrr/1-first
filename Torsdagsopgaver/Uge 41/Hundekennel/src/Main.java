import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Abdi", true);
        // sæt en ejer
        myDog.setOwner("Henning");
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe

        myDog.setOffSpring("d");
        myDog.setOffSpring("woodiesfido");

        // print alle hvalpe
        ArrayList<String> myOff = myDog.getOffSpring();
        for (String myD: myOff) {
            System.out.println(myD);
        }

        // print ejeren
        System.out.println("min hund er ejet af " + myDog.getOwner());

        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        boolean resString = myDog.feedDog();
        System.out.println(resString);
    }
}
