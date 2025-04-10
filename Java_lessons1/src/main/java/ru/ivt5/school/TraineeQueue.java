package ru.ivt5.School;

import java.util.LinkedList;
import java.util.Queue;

public class TraineeQueue {
    private final Queue<Trainee> queue;
    public TraineeQueue() {
        this.queue = new LinkedList<>();
    }
    public void addTrainee(Trainee trainee) {
        if (trainee == null) {
            throw new IllegalArgumentException("Студент не может быть null.");
        }
        queue.offer(trainee);
    }
    public Trainee removeTrainee() throws TrainingException {
        validateQueueIsNotEmpty();
        return queue.poll(); // Удаляем и возвращаем первого студента
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    private void validateQueueIsNotEmpty() throws TrainingException {
        if (queue.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.EMPTY_TRAINEE_QUEUE);
        }
    }
}