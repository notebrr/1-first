import java.util.ArrayList;

public class Dog {
    private boolean isHungry = true;
    private ArrayList<String> offSpring = new ArrayList<String>();
    private Owner ejer;


    public Dog(String abdi, boolean isHungry){

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
