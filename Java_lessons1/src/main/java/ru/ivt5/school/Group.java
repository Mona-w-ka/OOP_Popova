package ru.ivt5.School;
import java.util.*;

public class Group {
    private String name;
    private String room;
    private List<Trainee> trainees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trainee> getTrainees() {
        return trainees;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Group(String name, String room) throws TrainingException {
        if (name == null || name.isEmpty() || room == null || room.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_WRONG_FIRSTNAME);
        }
        this.name = name;
        this.room = room;
        this.trainees = new ArrayList<>();
    }

    public void removeTrainee(Trainee trainee) throws TrainingException {
        if (!trainees.remove(trainee)) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
    }

    public void removeTrainee(int index) throws TrainingException {
        if (index < 0 || index >= trainees.size()) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
        trainees.remove(index);
    }

    public Trainee getTraineeByFirstName(String firstName) {
        return (Trainee) trainees.stream().filter(item -> item.getName().equals(firstName));
    }

    public Trainee getTraineeByFullName(String fullName) {
        return (Trainee) trainees.stream().filter(item -> item.getFullName().equals(fullName));
    }

    public void sortTraineeListByFirstNameAscendant() {
        trainees.sort(Comparator.comparing(Trainee::getName));
    }

    public void sortTraineeListByRatingDescendant() {
        trainees.sort((t1, t2) -> Integer.compare(t2.getRating(), t1.getRating()));
    }

    public void reverseTraineeList() {
        trainees.reversed();
    }

    public void rotateTraineeList(int positions) {
        int size = trainees.size();
        if (size > 0) {
            Collections.rotate(trainees, positions % size);
        }
    }

    public List<Trainee> getTraineesWithMaxRating() throws TrainingException {
        if (trainees.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }

        int maxRating = trainees.stream().mapToInt(Trainee::getRating).max().orElse(0);
        List<Trainee> result = new ArrayList<>();
        for (Trainee trainee : trainees) {
            if (trainee.getRating() == maxRating) {
                result.add(trainee);
            }
        }
        return result;
    }

    public boolean hasDuplicates() {
        for (int i = 0; i < trainees.size(); i++) {
            for (int j = i + 1; j < trainees.size(); j++) {
                if (trainees.get(i).equals(trainees.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) && Objects.equals(room, group.room) && Objects.equals(trainees, group.trainees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, room, trainees);
    }
}



