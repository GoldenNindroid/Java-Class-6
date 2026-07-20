package codingal.SecondSetOfClasses.classSix;

class project {
    int sid = 845790;
    String name = "Cody";
    int age = 17;

    void getName(){
        System.out.println("Student ID: " + sid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        project obj = new project();
        obj.getName();
    }
}
