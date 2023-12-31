package Task;

public class SimpleTask extends Task {
    private String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    @Override
    public boolean matches(String query) {
        return title.contains(query);

    }

    public String getTitle() {
        return title;
    }
}
