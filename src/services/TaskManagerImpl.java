package services;



import models.Epic;
import models.Status;
import models.SubTask;
import models.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskManagerImpl implements TaskManager {
    private final HashMap<Integer, Task> taskHashMap = new HashMap<>();
    private final HashMap<Integer, Epic> epicHashMap = new HashMap<>();
    private final HashMap<Integer, SubTask> subTaskHashMap = new HashMap<>();
    private int id = 0;
    public static final double PIY = 3.14;
    /**
     * @param task
     */


    @Override
    public void addTask(Task task) {
        task.setId(generateId());
        task.setStatus(Status.NEW);
        taskHashMap.put(task.getId(), task);
    }

    @Override
    public Task getTaskById(int id) {
        return taskHashMap.get(id);
    }

    @Override
    public void updateTask(Task task) {
        taskHashMap.put(task.getId(), task);
    }

    @Override
    public ArrayList<Task> getAllTask() {

        return new ArrayList<>(taskHashMap.values());
    }

    @Override
    public void deleteAllTask() {
        taskHashMap.clear();
    }

    @Override
    public void deleteTaskById(int id) {
        taskHashMap.remove(id);
    }

    /**
     * @param epic
     */

    @Override
    public void addEpic(Epic epic) {
        epic.setId(generateId());
        epic.setStatus(Status.NEW);
        epicHashMap.put(epic.getId(), epic);
    }

    @Override
    public Epic getEpicById(int id) {
        return epicHashMap.get(id);
    }

    @Override
    public void updateEpic(Epic epic) {
        epicHashMap.put(epic.getId(), epic);
    }

    @Override
    public HashMap<Integer, Epic> getAllEpic() {
        return epicHashMap;
    }

    @Override
    public void deleteAllEpic() {
        epicHashMap.clear();
    }

    @Override
    public void deleteEpicById(int id) {
        epicHashMap.remove(id);
    }


    /**
     * @param subTask
     */

    @Override
    public void addSubTask(SubTask subTask) {
        subTask.setId(generateId());
        subTask.setStatus(Status.NEW);
        subTaskHashMap.put(subTask.getId(), subTask);
    }

    @Override
    public SubTask getSubTaskById(int id) {
        return subTaskHashMap.get(id);
    }

    @Override
    public void updateSubTask(SubTask subTask) {
        subTask.setStatus(subTask.getStatus());
        subTaskHashMap.put(subTask.getId(), subTask);
        epicHashMap.get(subTask.getEpic().getId()).addSubTask(subTask);

    }

    @Override
    public HashMap<Integer, SubTask> getAllSubTask() {
        return subTaskHashMap;
    }

    @Override
    public void deleteAllSubTask() {
        subTaskHashMap.clear();
    }

    @Override
    public void deleteSubTaskById(int id) {
        subTaskHashMap.remove(id);
    }

    private int generateId() {
        return id++;
    }


}
