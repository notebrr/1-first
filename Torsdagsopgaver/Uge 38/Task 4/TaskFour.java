class TaskFour{
  public static void main(String[] args){
    String[] stringArray = {"Java", "C#", "C++", "Python", "C"};
    int[] numArray = {1, 2, 3, 4, 5};
    boolean[] booleanArray = {true, false, true, false, true};

    myString(stringArray);
    getSum(numArray);
    getAverage(numArray);
  }

  static void myString(String[] getString){
    for(int i = 0; i < getString.length; i++){
      System.out.println(getString[i]);
    }
  }

  static void getSum(int[] getInt){
    int sum = 0;
    for(int i = 0; i < getInt.length; i++){
      sum = sum + getInt[i];
    }
    System.out.println("\nSum of all arrays: " + sum);
  }

  static void getAverage(int[] getInt){
    int sum = 0;
    for(int i = 0; i < getInt.length; i++){
      sum = sum + getInt[i];
    }
    System.out.println("\nAverage sum is: " + sum / getInt.length);
  }

}
