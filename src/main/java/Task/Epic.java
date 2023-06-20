package Task;

public class Epic extends Task {

    public String[] getSubtasks() {
        return subtasks;
    }

    private String[] subtasks;
    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks ) {
            if (subtask.contains(query)){
                return true;
            }
            
        }
        return false;
    }
}
