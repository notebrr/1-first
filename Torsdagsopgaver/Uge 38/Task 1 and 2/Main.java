public class Main{
  public static void main(String[] args){
    emptyLine();
    getString("Hello, world");
    yourInfo("Rehman", 19);

    /* Task 2 */
    if (iAmHappy()){
      System.out.println("I clap my hands");
    }else{
      System.out.println("I don't clap my hands");
    }

    System.out.println(sum(10, 20)); //2.b

    System.out.println(makeUpper("Make this uppercase")); //2.c

    System.out.println(checkIfUpper("Hsss")); //2.d
    /*  */
  }



  static void emptyLine(){ //1.b
    System.out.println("");
  }

  static void getString(String myStr){ //1.c
    System.out.println(myStr);
  }

  static void yourInfo(String name, int age){ //1.d
    System.out.println("My name is "+ name + ", I am " + age + " years old");
  }

  //Task 2
  public static boolean happy = true;

  public static boolean iAmHappy(){
    // fill out what is missing here:
    if(happy == true){
      return true;
    }else{
      return false;
    }
  }

  static int sum(int a, int b){
    int getSum = a + b;
    return getSum;
  }

  static String makeUpper(String myStr){
    return myStr.toUpperCase();
  }


  static boolean checkIfUpper(String myStr){
    char getFirst = myStr.charAt(0);
    boolean getBoolean = Character.isUpperCase(getFirst);
    return getBoolean;
  }
}
