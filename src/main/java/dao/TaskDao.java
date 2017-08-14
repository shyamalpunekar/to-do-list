package dao;
import models.Task;
import java.util.List;

public interface TaskDao {
    void add (Task task);
    List<Task> getAll();
    Task findById(int id);
}
