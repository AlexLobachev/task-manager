package services;

import models.Epic;
import models.SubTask;
import models.Task;

import java.util.ArrayList;
import java.util.HashMap;

public interface TaskManager {
    /**
     * @param task
     */
    void addTask(Task task);

    Task getTaskById(int id);

    void updateTask(Task task);

    ArrayList<Task> getAllTask();

    void deleteAllTask();

    void deleteTaskById(int id);

    /**
     * @param epic
     */

    void addEpic(Epic epic);

    Task getEpicById(int id);

    void updateEpic(Epic epic);

    HashMap<Integer, Epic> getAllEpic();

    void deleteAllEpic();

    void deleteEpicById(int id);

    /**
     * @param subTask
     */

    void addSubTask(SubTask subTask);

    Task getSubTaskById(int id);

    void updateSubTask(SubTask subTask);

    HashMap<Integer, SubTask> getAllSubTask();

    void deleteAllSubTask();

    void deleteSubTaskById(int id);

}
