package ch24;



public class StudentSubjectTest {
    public static void main(String[] args) {

        Student studentLee = new Student(1001,"Lee");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 98);

        Student studentKim = new Student(1002,"Kim");
        studentKim.addSubject("국어", 20);
        studentKim.addSubject("수학",80);
        studentKim.addSubject("영어", 55);

        studentLee.showScoreInfo();
        System.out.println("============");
        studentKim.showScoreInfo();

    }
}
