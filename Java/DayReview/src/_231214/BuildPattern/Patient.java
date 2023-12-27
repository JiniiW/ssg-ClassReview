package _231214.BuildPattern;

public class Patient {
    private final String name;
    private final String gender;
    private final int age;
    private final int height;
    private final int weight;

    public static class Builder{
        private final String name;
        private final String gender;
        private final int age;

        private int height = 0;
        private int weight = 0;

        public Builder(String name, String gender, int age){
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public Builder height (int val){
            height = val;
            return this;
        }
        public Builder weight(int val){
            weight = val;
            return this;
        }

        //바깥의 class이름을 적어야 반환한 값을 전달할 수 있다.
        public Patient build(){
            return new Patient(this);
        }

    }
    private Patient(Builder builder){
        name = builder.name;
        gender = builder.gender;
        age = builder.age;
        height = builder.height;
        weight = builder.weight;
    }

}
