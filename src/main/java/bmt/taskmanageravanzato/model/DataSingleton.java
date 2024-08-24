package bmt.taskmanageravanzato.model;

import java.util.ArrayList;

public class DataSingleton {

    private static final DataSingleton instance = new DataSingleton();
    public ArrayList<String> arrayUtente = new ArrayList<>();

    private DataSingleton(){

    }

    public static DataSingleton getInstance() {
        return instance;
    }

    public void setArrayUtente(ArrayList<String> arrayUtente){
        this.arrayUtente=arrayUtente;
    }
}
