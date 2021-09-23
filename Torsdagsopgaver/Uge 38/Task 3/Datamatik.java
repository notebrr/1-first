
class Datamatik{
  public static void main(String[] args){
    Teacher teacher = new Teacher();
    Student student1 = new Student();
    Student student2 = new Student();

    teacher.teacherData("Jesper", 34, false);

    String[] team = {"A", "B"};

    student1.studentData("Rehman", 19, false, team);
    student2.studentData("Gustav", 21, false, team);

    System.out.println("My teacher's name is " + teacher.name);
    System.out.println(student1.name + " is from team " + team[0]);
    System.out.println(student2.name + " is from team " + team[0]);
  }
}
