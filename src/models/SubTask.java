package models;

public class SubTask extends Task {

    private Epic epic;
    public SubTask(String nameTask, String descriptionTask) {
        super(nameTask, descriptionTask);
    }

    public SubTask(int id, String nameTask, String descriptionTask, Epic epic, Status status) {
        super(nameTask, descriptionTask);
        this.id = id;
        this.epic = epic;
        this.status = status;
    }



    public Epic getEpic() {
        return epic;
    }

    @Override
    public String toString() {
        return "SubTask{" +
                "nameTask='" + nameTask + '\'' +
                ", descriptionTask='" + descriptionTask + '\'' +
                ", status=" + status +
                ", id=" + id +
                //", epic=" + epic.getId() +
                '}';
    }
}

