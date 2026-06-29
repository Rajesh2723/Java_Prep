package LLD;

public class BuilderPatternStudent {

    private String name;
    private int age;
    private String college;

    private BuilderPatternStudent(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.college = builder.college;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("College : " + college);
    }

    public static class Builder {

        private String name;
        private int age;
        private String college;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCollege(String college) {
            this.college = college;
            return this;
        }

        public BuilderPatternStudent build() {
            return new BuilderPatternStudent(this);
        }
    }
}

class Main {

    public static void main(String[] args) {

        BuilderPatternStudent student =
                new BuilderPatternStudent.Builder()
                        .setName("Rajesh")
                        .setAge(26)
                        .setCollege("NIT")
                        .build();

        student.display();
    }
}