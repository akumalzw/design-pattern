package priv.akumalzw.design.builder;

import java.util.Date;

/**
 * 实体类
 */
public class Person {
    private String name;
    private int gender;
    private Date birth;
    private String idCard;

    private int height;
    private int weight;
    private String address;
    private String school;
    private String interest;
    private String skills;

    public static class Builder {
        Person person = new Person();

        public Builder basic(String name, int gender, Date birth, String idCard) {
            person.name = name;
            person.gender = gender;
            person.birth = birth;
            person.idCard = idCard;
            return this;
        }

        public Builder height(int height) {
            person.height = height;
            return this;
        }

        public Builder weight(int weight) {
            person.weight = weight;
            return this;
        }

        public Builder address(String address) {
            person.address = address;
            return this;
        }

        public Builder school(String school) {
            person.school = school;
            return this;
        }

        public Builder interest(String interest) {
            person.interest = interest;
            return this;
        }

        public Builder skills(String skills) {
            person.skills = skills;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", idCard='" + idCard + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", interest='" + interest + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}
