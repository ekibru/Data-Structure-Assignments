package Assignment;

public class Question4 {
    public class Course {
        private String courseID;
        private String courseName;
        private int creditHours;

        public Course(String courseID, String cName, int creditHours) {
            this.courseID = courseID;
            this.courseName = courseName;
            this.creditHours = creditHours;
        }

        public String getcourseID() {
            return courseID;
        }

        public String getcourseName() {
            return courseName;
        }

        public int getCreditHours() {
            return creditHours;
        }

    }
}
