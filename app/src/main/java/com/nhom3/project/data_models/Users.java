package com.nhom3.project.data_models;

public class Users {
    private String userName;
    private int testID;

    public Users(String userName, int testID)
    {
        this.userName = userName;
        this.testID = testID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }
}
