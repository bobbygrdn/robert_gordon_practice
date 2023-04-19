package sba_core_java.exercise2;

public class MajorLeagueSoccer {
    private int[] playerNumberArray;

    public MajorLeagueSoccer() {
        this.playerNumberArray = new int[11];

        for (int i = 0; i < this.playerNumberArray.length; i++) {
            this.playerNumberArray[i] = i + 1;
        }
    }

    public void sendPlayerToMinorLeague(int playerID) {
        if (playerNumberArray[playerID - 1] > 0) {
            playerNumberArray[playerID - 1] = -1;
            System.out.println("Player " + playerID + " sent to minor league");
        } else {
            System.out.println("Player " + playerID + " is no longer available");
        }
    }

    public void transferPlayerToDifferentTeam(int playerID, String destinationTeam) {
        if (playerNumberArray[playerID - 1] > 0) {
            playerNumberArray[playerID - 1] = -1;
            System.out.println("Player " + playerID + " is transferred to " + destinationTeam);
        } else {
            System.out.println("Player " + playerID + " is no longer available");
        }
    }

    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }

}
