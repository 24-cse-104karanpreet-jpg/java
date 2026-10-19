class student
int roll_no;
String name;
int m1;
int m2;
int m3;

Student(int roll_no,String name,int m1, int m2,int m3){
this.roll_no = roll_no;  
this.name = name;
this.m1 = m1;
this.m2 = m2;
this.m3 = m3;
}
int total() {
  return m1 + m2 + m3 ;
}
 double percentage() {
   return total()/ 3.0;
 }
  void display() {
    System.out.println("roll_no" + this.roll_no);
    System.out.println("name" + this.name);
    System.out.println("marks 1" + this.m1);
    System.out.println("marks 2" + this.m2);
    System.out.println("marks 3" + this.m3);
    System.out.println("total marks" + total());
    System.out.println("percentage" +percentage()+"\n");
  }    
}
  public class main (){
    public static void main (string[] args){
     student s1= new student(110,"rishab",90,80,60);
     student s2= new student(110,"gulab",90,80,60);
     student s3= new student(110,"kajol",90,80,60);
s1.display();
s2.display(); 
s3.display();
}
}
