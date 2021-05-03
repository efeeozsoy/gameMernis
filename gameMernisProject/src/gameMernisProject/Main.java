package gameMernisProject;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Efe", "12345", "Özsoy", new GregorianCalendar(1941, 12 , 01).getTime());
        Game game = new Game("League Of Legends", "Riot Games", 25);
        Game game2 = new Game("Call Of Duty2", "Activision", 150);

        GamerManager gamerManager = new GamerManager(new DatabaseLogger(), new MernisValidateManager());
        gamerManager.add(gamer);

        GameManager gameManager = new GameManager(new DatabaseLogger());
        gameManager.add(game);
        gameManager.update(game);

        MyPlatformManager myPlatformManager = new MyPlatformManager(new CampaignManager());
        Game[] games = {game, game2};
        myPlatformManager.buyGame(gamer, games);
        myPlatformManager.refund(gamer, games);

	}

}
