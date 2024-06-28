package models;

import java.util.Objects;

public class Task {
    protected final String nameTask;
    protected String descriptionTask;
    protected Status status;
    protected int id;




    public Task(String nameTask, String descriptionTask) {

        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;

    }
    public Task(int id, String nameTask, String descriptionTask, Status status) {
        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;
        this.status = status;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return getId() == task.getId() && nameTask.equals(task.nameTask) && descriptionTask.equals(task.descriptionTask) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameTask, descriptionTask, status, getId());
    }

    @Override
    public String toString() {
        return "Task{" +
                "nameTask='" + nameTask + '\'' +
                ", descriptionTask='" + descriptionTask + '\'' +
                ", status=" + status +
                ", id=" + id +
                '}';
    }
}
