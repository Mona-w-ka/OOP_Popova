package ru.ivt5.School;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TraineeMap {
    private final Map<Trainee, String> map = new HashMap<>();

    public TraineeMap() {
    }

    public void addTraineeInfo(Trainee trainee, String institute) throws TrainingException {
        validateTraineeNotExists(trainee);
        map.put(trainee, institute);
    }

    public void replaceTraineeInfo(Trainee trainee, String institute) throws TrainingException {
        validateTraineeExists(trainee);
        map.replace(trainee, institute);
    }
    public void removeTraineeInfo(Trainee trainee) throws TrainingException {
        validateTraineeExists(trainee);
        map.remove(trainee);
    }
    public int getTraineesCount() {
        return map.size();
    }
    public String getInstituteByTrainee(Trainee trainee) throws TrainingException {
        validateTraineeExists(trainee);
        return map.get(trainee);
    }
    public Set<Trainee> getAllTrainees() {
        return map.keySet();
    }
    public Set<String> getAllInstitutes() {
        return Set.copyOf(map.values());
    }
    public boolean isAnyFromInstitute(String institute) {
        return map.containsValue(institute);
    }

    private void validateTraineeExists(Trainee trainee) throws TrainingException {
        if (!map.containsKey(trainee)) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
    }
    private void validateTraineeNotExists(Trainee trainee) throws TrainingException {
        if (map.containsKey(trainee)) {
            throw new TrainingException(TrainingErrorCode.DUPLICATE_TRAINEE);
        }
    }
}