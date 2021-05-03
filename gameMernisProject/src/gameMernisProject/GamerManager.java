package gameMernisProject;

public class GamerManager implements GamerService {

    private final LoggerService loggerService;
    private UserValidationService userValidationService;

    public GamerManager(LoggerService loggerService, UserValidationService userValidationService){
        this.loggerService = loggerService;
        this.userValidationService = userValidationService;
    }

    @Override
    public void add(Gamer gamer) {
        if(!userValidationService.validate(gamer)) {
            System.out.println("Not valid user!");
            return;
        }
        loggerService.add(gamer);
        System.out.println("Gamer added to database");
    }

    @Override
    public void update(Gamer gamer) {
        loggerService.update(gamer);
        System.out.println(gamer.getFirstName() + " updated");
    }

    @Override
    public void delete(Gamer gamer) {
        loggerService.delete(gamer);
        System.out.println(gamer.getFirstName() + " deleted");
    }
}
