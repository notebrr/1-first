import java.util.ArrayList;

public class Dog {
    String name;
    private boolean isHungry;
    private ArrayList<String> offSpring = new ArrayList<>();
    private Owner ejer;

    public Dog(String name, boolean isHungry){
        this.name = name;
        this.isHungry = isHungry;
    }

    public void setOwner(String myOwner){
        ejer = new Owner(myOwner);
    }

    public boolean feedDog(){
        if(isHungry == true){
            isHungry = false;

            return true;
        }else{
            return false;
        }
    }


    public boolean getIsHungry() {
        return isHungry;
    }

    public void setIsHungry(boolean hungry) {
        isHungry = hungry;
    }


    public ArrayList<String> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(String e) {
        offSpring.add(e);
    }

    public Owner getOwner() {
        return ejer;
    }
}
