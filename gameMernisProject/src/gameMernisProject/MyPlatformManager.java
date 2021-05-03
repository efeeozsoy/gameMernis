package gameMernisProject;

public class MyPlatformManager implements PlatformService {

    private SalesService salesService;

    public MyPlatformManager(SalesService salesService){
        this.salesService = salesService;
    };

    @Override
    public void buyGame(Gamer gamer, Game[] games) {
        for(Game game : games) {
            salesService.discount(game, 25);
            System.out.println(gamer.getFirstName() + " bought the " + game.getName() + ".");
        }
    }

    @Override
    public void refund(Gamer gamer, Game[] games) {
        System.out.println(gamer.getFirstName() + " has asked for refund.");
    }
}
