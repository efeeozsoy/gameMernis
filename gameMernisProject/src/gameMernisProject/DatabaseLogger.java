package gameMernisProject;

public class DatabaseLogger implements LoggerService {

    @Override
    public void add(Entity entity) {
        System.out.println("Database has been logged!");
    }

    @Override
    public void update(Entity entity) {
        System.out.println("Database has been updated!");
    }

    @Override
    public void delete(Entity entity) {
        System.out.println("Database has been deleted!");
    }
}
