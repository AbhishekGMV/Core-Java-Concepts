package com.examples.core;

class Todo{

    //Variables can be access only through getters and setters
    private int taskID;
    private String title;
    private boolean isComplete;

    public Todo() {} //Default constructor

    public Todo(int taskID, String title, boolean isComplete) {
        this.taskID = taskID;
        this.title = title;
        this.isComplete = isComplete;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "taskID=" + taskID +
                ", title='" + title + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Todo t1 = new Todo(1,"eat",true);
        Todo t2 = new Todo();
        t2.setTaskID(2);
        t2.setTitle("sleep");
        t2.setComplete(false);

        System.out.println(t1);
        System.out.println(t2);
    }
}
