package gameMernisProject;

public class CampaignManager implements SalesService {

    @Override
    public void discount(Entity entity, int discount) {
        System.out.printf("%d discount has been set to your game.%n", discount);
    }
}
