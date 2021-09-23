
class Student{
  String name = Student.this.name;
  int age = Student.this.age;
  boolean isFemale = Student.this.isFemale;
  String[] datamatikerTeam = Student.this.datamatikerTeam;

  public void studentData(String tmpName, int tmpAge, boolean tmpIsFemale, String[] tmpDatamatikerTeam){
    name = tmpName;
    age = tmpAge;
    isFemale = tmpIsFemale;
    datamatikerTeam = tmpDatamatikerTeam;
  }
}
