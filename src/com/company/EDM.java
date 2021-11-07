package com.company;

public class EDM {
    private boolean isConnectedToInternet;

    public boolean isConnectedToInternet() {
        return isConnectedToInternet;
    }

    public void connecting(){
        System.out.println("Сonnected to the network");
        isConnectedToInternet= true;
    }
    public void disconnecting(){
        System.out.println("Unable to connect to this network");
        isConnectedToInternet=false;
    }
}
