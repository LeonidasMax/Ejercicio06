package Lista;

public class ClsTaskList {
    private String traskname;
    private String taskDescription;
    private boolean isDone;

    public void setTraskname(String traskname) {
        this.traskname = traskname;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getTraskname() {
        return traskname;

    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean isDone() {
        return isDone;
    }
}
