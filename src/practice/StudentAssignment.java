package practice;

import java.util.Objects;

public class StudentAssignment implements Comparable<StudentAssignment> {
    private int StudentId;
    private String name;
    private int score;

    public StudentAssignment(int studentId, String name, int score){
        this.name = name;
        this.score = score;
        this.StudentId = studentId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(StudentAssignment o) {
        return  this.score - o.score;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if (this.getClass().equals(obj.getClass())){
            StudentAssignment s = (StudentAssignment) obj;

            return this.StudentId== s.StudentId && this.score==s.score
                    && this.name.equals(s.name);
        }else{
            return false;
        }

    }
    @Override
    public int hashCode(){
        return Objects.hash(StudentId,score,name);
    }

}
