package Seminars_OOP.Seminar6;

public interface CommandHandler {

    String commandName();

    void handleCommand(RobotMap map, String[] args);

}