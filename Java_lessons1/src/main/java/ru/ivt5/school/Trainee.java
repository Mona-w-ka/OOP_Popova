package ru.ivt5.school;

import java.util.Objects;

public class Trainee {
    private String name;
    private String surname;
    private int rating;

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) throws TrainingException {
        if (name == null || name.trim().isEmpty()) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_WRONG_FIRSTNAME);
        }
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Trainee(String firstName, String lastName, int rating) throws TrainingException {
            setName(name);
            setSurname(surname);
            setRating(rating);

    }
    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return rating == trainee.rating && Objects.equals(name, trainee.name) && Objects.equals(surname, trainee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, rating);
    }


}
