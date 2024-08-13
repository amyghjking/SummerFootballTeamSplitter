/**
 * Player class stores information about the player:
 * - Winter team they played for in 2024
 * - The position that they play
 * - Their commitment to playing summer football
 */
public class Player {
  private String name;
  private String winterTeam;
  private String position;
  private String commitment;

  /**
   * Constructor initialises player attributes.
   *
   * @param name Name of the player in firstname lastname format.
   * @param winterTeam Winter team played for in 2024.
   * @param position Position they play.
   * @param commitment Commitment to summer games.
   */
  public Player(String name, String winterTeam, String position, String commitment) {
    this.name = name;
    this.winterTeam = winterTeam;
    this.position = position;
    this.commitment = commitment;
  }

  /**
   * Returns name.
   *
   * @return name.
   */
  public String getName() { return name; }

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
