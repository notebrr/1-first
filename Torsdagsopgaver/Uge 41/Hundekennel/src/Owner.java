import java.util.ArrayList;

public class Owner {
    private ArrayList<String> myOwner = new ArrayList<String>();

    public Owner(String myNewOwner){
        myOwner.add(myNewOwner);
    }

    public ArrayList<String> getSetOwner() {
        return myOwner;
    }

    @Override
    public String toString() {
        return "\n" + myOwner;
    }
}
