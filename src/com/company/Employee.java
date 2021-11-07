package com.company;

public class Employee  {
    public void workWithDoc(EDM edm){
        if(edm.isConnectedToInternet()){
            System.out.println("The document is processed by employees");
        }
        else {
            System.out.println("Processing failed");
        }
    }

}
