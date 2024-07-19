package com.iphone;

public class iPhone implements MusicPlayer, Phone, WebBrowser {

    @Override
    public void playMusic(String song) {
        System.out.println("Playing song: " + song);
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling: " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Call ended.");
    }

    @Override
    public void browse(String url) {
        System.out.println("Browsing URL: " + url);
    }

    @Override
    public void openNewTab() {
        System.out.println("New tab opened.");
    }

    @Override
    public void closeTab() {
        System.out.println("Tab closed.");
    }

    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();

        // Testando funcionalidades de MusicPlayer
        myiPhone.playMusic("Favorite Song");
        myiPhone.stopMusic();

        // Testando funcionalidades de Phone
        myiPhone.makeCall("123-456-7890");
        myiPhone.endCall();

        // Testando funcionalidades de WebBrowser
        myiPhone.browse("www.example.com");
        myiPhone.openNewTab();
        myiPhone.closeTab();
    }
}
