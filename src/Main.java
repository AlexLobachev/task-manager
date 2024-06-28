import models.Epic;
import models.Status;
import models.SubTask;
import models.Task;
import services.TaskManagerImpl;

public class Main {
    public static void main(String[] args) {

        TaskManagerImpl taskManager = new TaskManagerImpl();

        //TODO TASK
        System.out.println(TaskManagerImpl.PIY);
        taskManager.addTask(new Task("Задача 1", "Задача-Описание 1"));
        taskManager.addTask(new Task("Задача 2", "Задача-Описание 2"));
        System.out.println("getTaskById -->>  \n" + taskManager.getTaskById(0));
        System.out.println("getAllTask -->>  \n" + taskManager.getAllTask());
        taskManager.deleteTaskById(1);
        System.out.println("deleteTaskById -->>  \n" + taskManager.getTaskById(1));
        taskManager.deleteAllTask();
        System.out.println("deleteAllTask -->>  \n" + taskManager.getAllTask());
        taskManager.addTask(new Task("Задача 1", "Задача-Описание 1"));
        System.out.println("updateTask -->>  \n" + taskManager.getTaskById(2));
        taskManager.updateTask(new Task(2, "Задача 1", "Задача-Описание 1", Status.DONE));
        System.out.println("updateTask -->>  \n" + taskManager.getTaskById(2));

        //TODO EPIC
        System.out.println("----------------ЭПИКИ БЕЗ ПОДЗАДАЧ----------------");
        taskManager.addEpic(new Epic("Эпик 1" , "Эпик-Описание 1"));
        taskManager.addEpic(new Epic("Эпик 2", "Эпик-Описание 2"));
        System.out.println("getEpicById -->>  \n" + taskManager.getEpicById(3));
        System.out.println("getAllEpic -->>  \n" + taskManager.getAllEpic());
        taskManager.deleteEpicById(3);
        System.out.println("deleteEpicById -->>  \n" + taskManager.getEpicById(1));
        taskManager.deleteAllEpic();
        System.out.println("deleteAllEpic -->>  \n" + taskManager.getAllEpic());
        taskManager.addEpic(new Epic("Эпик 1", "Эпик-Описание 1"));
        System.out.println("updateEpic -->>  \n" + taskManager.getEpicById(5));
        taskManager.updateEpic(new Epic(5, "Эпик 666", "Эпик-Описание 666"));
        System.out.println("updateEpic -->>  \n" + taskManager.getEpicById(5));

        //TODO SUBTASK
        System.out.println("----------------САБТАСКИ----------------");
        taskManager.addSubTask(new SubTask("Сабтаск 1" , "Сабтаск-Описание 1"));
        taskManager.addSubTask(new SubTask("Сабтаск 2", "Сабтаск-Описание 2"));
        System.out.println("getSubTaskById -->>  \n" + taskManager.getSubTaskById(6));
        System.out.println("getAllSubTask -->>  \n" + taskManager.getAllSubTask());
        taskManager.deleteSubTaskById(6);
        System.out.println("deleteSubTaskById -->>  \n" + taskManager.getSubTaskById(6));
        taskManager.deleteAllSubTask();
        System.out.println("deleteAllSubTask -->>  \n" + taskManager.getAllSubTask());
        taskManager.addSubTask(new SubTask("Сабтаск 1" , "Сабтаск-Описание 1"));
        System.out.println("getSubTaskById -->>  \n" + taskManager.getAllSubTask());
        taskManager.updateSubTask(new SubTask(8,"Сабтаск 1","Сабтаск-Описание 1",taskManager.getEpicById(5),Status.IN_PROGRESS));
        System.out.println("updateSubTask -->>  \n" + taskManager.getAllSubTask());
        System.out.println("getEpicById -->>  \n" + taskManager.getEpicById(5));
        taskManager.addSubTask(new SubTask("Сабтаск 2", "Сабтаск-Описание 2"));
        taskManager.updateSubTask(new SubTask(9,"Сабтаск 2","Сабтаск-Описание 2",taskManager.getEpicById(5),Status.IN_PROGRESS));
        System.out.println("updateSubTask -->>  \n" + taskManager.getAllSubTask());
        System.out.println("getEpicById -->>  \n" + taskManager.getEpicById(5));
        taskManager.addSubTask(new SubTask("Сабтаск 3", "Сабтаск-Описание 3"));
        taskManager.addEpic(new Epic("Эпик 2", "Эпик-Описание 2"));
        taskManager.updateSubTask(new SubTask(10,"Сабтаск 3","Сабтаск-Описание 3",taskManager.getEpicById(11),Status.IN_PROGRESS));
        System.out.println("getEpicById -->>  \n" + taskManager.getEpicById(11));
        System.out.println("getEpicById -->>  \n" + taskManager.getEpicById(5));
    }
}