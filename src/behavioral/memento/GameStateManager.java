package behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameStateManager {

  private final Deque<GameStateSnapshot> snapshots = new ArrayDeque<>();

  public void saveGame(final GameState gameState) {
    snapshots.push(new GameStateSnapshot(gameState));
  }

  public GameStateSnapshot restorePreviousCheckpoint() {
    return snapshots.pop();
  }
}