
class Teacher{
  String name = Teacher.this.name;
  int age = Teacher.this.age;
  boolean isFemale = Teacher.this.isFemale;
  
  public void teacherData(String tmpName, int tmpAge, boolean tmpIsFemale){
    name = tmpName;
    age = tmpAge;
    isFemale = tmpIsFemale;
  }
}
