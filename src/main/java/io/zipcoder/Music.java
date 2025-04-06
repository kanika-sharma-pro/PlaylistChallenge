package io.zipcoder;

public class Music {

    private String[] playList; //instance variable to store playlist

    //constructor to initialize music object with playlist
    public Music(String[] playList) {

        this.playList = playList;
    }
//method to calculate minimum button presses to select a song
    public Integer selection(Integer startIndex, String selection) {
        int n = playList.length;
        int qIndex = -1;//it tells us that target song is not found in the playlist

        //loop through playlist to find the index of the target song
        for (int i = 0; i < n; i++) {
            if (playList[i].equals(selection)) {
                qIndex = i;
                break;
            }
        }
        if (qIndex == -1) {
            return -1;
        }
        //number of button presses to go down
        int forwardPresses = 0;
        int currentIndex = startIndex;//start from the starting index
//while loop until the index reaches the target song index
        while (currentIndex != qIndex) {
            currentIndex = (currentIndex + 1) % n; // move to next song
            forwardPresses++;
        }
    }
}
