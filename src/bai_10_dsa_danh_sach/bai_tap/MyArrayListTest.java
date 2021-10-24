package bai_10_dsa_danh_sach.bai_tap;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {

        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Thanh");
        Student b = new Student(2, "Mai");
        Student c = new Student(3, "Nga");
        Student d = new Student(4, "Huy");
        Student e = new Student(5, "Chi");
        Student f = new Student(6, "Hoa");
        Student g = new Student(7, "Binh");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(f);
//        studentMyArrayList.add(g,2);
//        studentMyArrayList.clear();
//        System.out.println(studentMyArrayList.size());
//        for(int i=0;i<studentMyArrayList.size();i++){
//            Student student=(Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//

//        System.out.println(studentMyArrayList.get(1).getName());
//        System.out.println(studentMyArrayList.get(10).getName());


//        System.out.println(studentMyArrayList.indexOf(c));
//        System.out.println(studentMyArrayList.indexOf(g));
//
//        System.out.println(studentMyArrayList.contains(b));
//        System.out.println(studentMyArrayList.contains(g));

//        newMyArrayList=studentMyArrayList.clone();
//        for(int i=0;i<newMyArrayList.size();i++){
//            System.out.println(newMyArrayList.get(i).getName());
//        }

//        for(int i=0;i<studentMyArrayList.size();i++){
//            System.out.println( studentMyArrayList.remove(1).getName());
//        }

//        newMyArrayList=studentMyArrayList.clone();
//        newMyArrayList.remove(1);
//        for(int i=0;i<newMyArrayList.size();i++){
//            System.out.println(newMyArrayList.get(i).getName());
//        }

        newMyArrayList=studentMyArrayList.clone();
        Student student=newMyArrayList.remove(1);
        System.out.println(student.getName());


    }
}