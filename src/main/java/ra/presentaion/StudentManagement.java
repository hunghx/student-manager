package ra.presentaion;

import ra.bussiness.entity.Student;
import ra.bussiness.service.IStudentService;
import ra.bussiness.serviceimpl.StudentService;

public class StudentManagement {
    protected static final IStudentService studentService = new StudentService();
    public static void main(String[] args) {
//        Student s1 = new Student(0,"Nguyễn Văn A","0847637974","Hà Nội",true);
//        Student s2 = new Student(0,"Nguyễn Văn B","0948354974","Hồ Chí Minh",false);
//        Student s3 = new Student(0,"Nguyễn Văn C","0847098334","Nghệ An",false);
//        Student s4 = new Student(0,"Nguyễn Văn D","0847382488","Thanh Hóa",true);
//        studentService.save(s1);
//        studentService.save(s2);
//        studentService.save(s3);
//        studentService.save(s4);
//        Student s2 = new Student(11,"Nguyễn Văn B Up date","0948464974","Hà Nội",true);
//       studentService.save(s2);
       studentService.deleteById(10);
        for (Student s:studentService.findAll()
             ) {
            System.out.println(s);
        }
    }
}
