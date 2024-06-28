package models;

import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    private final List<SubTask> subTaskEpic = new ArrayList<>();;

    public Epic(String nameTask, String descriptionTask) {
        super(nameTask, descriptionTask);

    }

    public Epic(int id, String nameTask, String descriptionTask) {
        super(nameTask, descriptionTask);
        this.id = id;

    }

    public void addSubTask(SubTask subTask){
        subTaskEpic.add(subTask);
    }





    @Override
    public String toString() {
        return "Epic{" +
                "nameEpic='" + nameTask + '\'' +
                ", descriptionEpic='" + descriptionTask + '\'' +
                ", status=" + status +
                ", id=" + id +
                ", subTaskEpic=" + subTaskEpic +
                '}';
    }
}
