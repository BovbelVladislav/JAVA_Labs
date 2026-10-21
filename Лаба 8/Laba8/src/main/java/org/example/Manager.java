package org.example;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, double salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(getName() + " управляет командой из " + teamSize + " человек.");
    }

    public void holdMeeting() {
        System.out.println(getName() + " проводит планерку с командой.");
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(teamSize);
    }
}
