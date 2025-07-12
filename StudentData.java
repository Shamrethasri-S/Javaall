// Constructor Overloading in Java
class StudentData {
    private int stuID;
    private String stuName;
    private int stuAge;

    // Default constructor
    StudentData() {
        stuID = 100;
        stuName = "New Student";
        stuAge = 18;
    }

    // Parameterized constructor
    StudentData(int num1, String str, int num2) {
        stuID = num1;
        stuName = str;
        stuAge = num2;
    }  // Getter and setter methods
    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    // Driver code
    public static void main(String args[]) {
        // Object creation calling the default constructor
        StudentData myobj = new StudentData();
        System.out.println("Student Name: " + myobj.getStuName());
        System.out.println("Student Age: " + myobj.getStuAge());
        System.out.println("Student ID: " + myobj.getStuID());

        // Object creation calling the parameterized constructor
        StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
        System.out.println("\nStudent Name: " + myobj2.getStuName());
        System.out.println("Student Age: " + myobj2.getStuAge());
        System.out.println("Student ID: " + myobj2.getStuID());
    }
}

    