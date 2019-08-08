package com.company;

import java.util.ArrayList;

public interface ISaveable {
    public ArrayList<String> write();
    public void read(ArrayList<String> savedValues);
}
