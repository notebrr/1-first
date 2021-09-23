
class Datamatik{
  Student student1 = new Student();
  Student student2 = new Student();

  static String[] team = new String[10];

  public static void pupils(String[] getArray, int getNum){
    System.out.println(getArray[getNum]);
  }

  public static void findName(String[] getArray, String getString){
    for(int i = 0; i < getArray.length; i++){
      if(getArray[i] == getString){
        System.out.println("\n" + getString + " is the " + i + "th student");
      }
    }
  }

  public static void main(String[] args){

    team[0] = "Rehman";
    team[1] = "Lars";
    team[2] = "Mohammed";
    team[3] = "Jeppe";
    team[4] = "Mathias";
    team[6] = "Joe";
    team[7] = "Jolene";
    team[8] = "Ibrahim";
    team[9] = "Drake";

    pupils(team, 3);
    findName(team, "Mohammed");
    findName(team, "Drake");
    findName(team, "Kanye");
  }
}
