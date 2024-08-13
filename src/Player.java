/**
 * Player class stores information about the player:
 * - Winter team they played for in 2024
 * - The position that they play
 * - Their commitment to playing summer football
 */
public class Player {
  private String winterTeam;
  private String position;
  private String commitment;

  /**
   * Constructor initialises player attributes.
   *
   * @param winterTeam Winter team played for in 2024.
   * @param position Position they play.
   * @param commitment Commitment to summer games.
   */
  public Player(String winterTeam, String position, String commitment) {
    this.winterTeam = winterTeam;
    this.position = position;
    this.commitment = commitment;
  }

  /**
   * Returns winterTeam.
   *
   * @return winterTeam.
   */
  public String getWinterTeam() { return winterTeam; }

  /**
   * Returns position.
   *
   * @return position.
   */
  public String getPosition() { return position; }

  /**
   * Returns commitment.
   *
   * @return commitment.
   */
  public String getCommitment() { return commitment; }
}
