public class Student {

        private final int id;
        private final String firstName;
        private final String middleName;
        private final String lastName;
        private final int age;
        private final String email;
        private final String course;
        private final int yearLevel;
        private final String section;
        private final String school;
        private final String gender;

        private Student(Builder builder) {
            this.id = builder.id;
            this.firstName = builder.firstName;
            this.middleName = builder.middleName;
            this.lastName = builder.lastName;
            this.age = builder.age;
            this.email = builder.email;
            this.course = builder.course;
            this.yearLevel = builder.yearLevel;
            this.section = builder.section;
            this.school = builder.school;
            this.gender = builder.gender;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }

        public String getCourse() {
            return course;
        }

        public int getYearLevel() {
            return yearLevel;
        }

        public String getSection() {
            return section;
        }

        public String getSchool() {
            return school;
        }

        public String getGender() {
            return gender;
        }

}
