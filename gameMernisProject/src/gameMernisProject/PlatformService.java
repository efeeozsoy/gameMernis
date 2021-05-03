package gameMernisProject;

public interface PlatformService {
    void buyGame(Gamer gamer, Game[] games);
    void refund(Gamer gamer, Game[] games);
}
