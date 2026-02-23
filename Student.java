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

public static class Builder {
        private int id = 0;
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String email;
        private String course;
        private int yearLevel;
        private String section;
        private String school;
        private String gender;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setYearLevel(int yearLevel) {
            this.yearLevel = yearLevel;
            return this;
        }

        public Builder setSection(String section) {
            this.section = section;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student " + id +
                " | " + firstName +
                " | " + middleName +
                " | " + lastName +
                " | " + age +
                " | " + email +
                " | " + course +
                " | " + yearLevel +
                " | " + section +
                " | " + school +
                " | " + gender;
    }


this.id
