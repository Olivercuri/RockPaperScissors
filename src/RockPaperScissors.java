import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerA;
        String playerB;
        String playAgain;

        do {

            System.out.println("\n===== ROCK PAPER SCISSORS =====");

            // Get Player A's move
            do {
                System.out.print("Player A, enter Rock (R), Paper (P), or Scissors (S): ");
                playerA = in.nextLine();

                if (!playerA.equalsIgnoreCase("R") &&
                        !playerA.equalsIgnoreCase("P") &&
                        !playerA.equalsIgnoreCase("S")) {

                    System.out.println("Invalid choice! Please enter R, P, or S.");
                }

            } while (!playerA.equalsIgnoreCase("R") &&
                    !playerA.equalsIgnoreCase("P") &&
                    !playerA.equalsIgnoreCase("S"));


            // Get Player B's move
            do {
                System.out.print("Player B, enter Rock (R), Paper (P), or Scissors (S): ");
                playerB = in.nextLine();

                if (!playerB.equalsIgnoreCase("R") &&
                        !playerB.equalsIgnoreCase("P") &&
                        !playerB.equalsIgnoreCase("S")) {

                    System.out.println("Invalid choice! Please enter R, P, or S.");
                }

            } while (!playerB.equalsIgnoreCase("R") &&
                    !playerB.equalsIgnoreCase("P") &&
                    !playerB.equalsIgnoreCase("S"));


            // Display the results
            System.out.println("\n===== GAME RESULTS =====");

            if (playerA.equalsIgnoreCase(playerB)) {

                System.out.println("It's a Tie!");

            }
            else if (playerA.equalsIgnoreCase("R") &&
                    playerB.equalsIgnoreCase("S")) {

                System.out.println("Rock breaks Scissors!");
                System.out.println("Player A wins!");

            }
            else if (playerA.equalsIgnoreCase("P") &&
                    playerB.equalsIgnoreCase("R")) {

                System.out.println("Paper covers Rock!");
                System.out.println("Player A wins!");

            }
            else if (playerA.equalsIgnoreCase("S") &&
                    playerB.equalsIgnoreCase("P")) {

                System.out.println("Scissors cuts Paper!");
                System.out.println("Player A wins!");

            }
            else if (playerB.equalsIgnoreCase("R") &&
                    playerA.equalsIgnoreCase("S")) {

                System.out.println("Rock breaks Scissors!");
                System.out.println("Player B wins!");

            }
            else if (playerB.equalsIgnoreCase("P") &&
                    playerA.equalsIgnoreCase("R")) {

                System.out.println("Paper covers Rock!");
                System.out.println("Player B wins!");

            }
            else if (playerB.equalsIgnoreCase("S") &&
                    playerA.equalsIgnoreCase("P")) {

                System.out.println("Scissors cuts Paper!");
                System.out.println("Player B wins!");

            }


            // Ask to play again
            System.out.print("\nWould you like to play again? (Y/N): ");

            playAgain = in.nextLine();

            while (!playAgain.equalsIgnoreCase("Y") &&
                    !playAgain.equalsIgnoreCase("N")) {

                System.out.print("Please enter Y or N: ");
                playAgain = in.nextLine();

            }

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("\nThanks for playing Rock Paper Scissors!");

        in.close();

    }
}