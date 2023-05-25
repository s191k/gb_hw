package Lesson_7_OOP.lesson7.observer;

import java.util.Random;

public enum WorkerType {

    MASTER,
    STUDENT,
    QA;

    public static WorkerType getRandomWorkerType() {
        WorkerType[] workerTypes = values();
        return workerTypes[new Random().nextInt(workerTypes.length)];
    }

}
