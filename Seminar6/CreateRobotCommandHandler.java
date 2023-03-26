package Seminars_OOP.Seminar6;

public class CreateRobotCommandHandler implements CommandHandler {

    @Override
    public String commandName() {
        return "create-robot";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        int hh = Integer.parseInt(args[0]);
        int gg = Integer.parseInt(args[1]);
        RobotMap.Robot robot = null;
        if (hh > 0 & gg > 0) {
            try {
                robot = map.createRobot(new Point(hh, gg));
                System.out.println(" Робот " + robot + " создан");
            } catch (PositionException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Робот с идентификаторо " + robot + " не создан вне поля");
        }

    }
}
