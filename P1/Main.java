class Student { 
    int rollNo;
    String name;
    int m1;
    int m2;
    int m3;
    Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;  
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
   int total() {
        return m1 + m2 + m3;
    }
    double percentage() {
        return total() / 3.0;
    }
    void display() {
        System.out.println("Roll No:    " + this.rollNo);
        System.out.println("Name:       " + this.name);
        System.out.println("Marks 1:    " + this.m1);
        System.out.println("Marks 2:    " + this.m2);
        System.out.println("Marks 3:    " + this.m3);
        System.out.println("Total:      " + total());
        System.out.println("Percentage: " + percentage() + "%" + "\n");
    }    
}

class Main { 
    public static void main(String[] args) {
        Student s1 = new Student(110, "Rishab", 90, 80, 60);
        Student s2 = new Student(111, "Gulab", 85, 75, 95); 
        Student s3 = new Student(112, "Kajol", 92, 88, 90);  

        s1.display();
        s2.display(); 
        s3.display();
    }
}
