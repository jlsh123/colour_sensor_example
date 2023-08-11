package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;





@TeleOp(name = "colour sensor", group = "final")
public class colourSensor extends LinearOpMode {

    hwMap robot = new hwMap();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        telemetry.addData("calibrating", "initialized");
        telemetry.update();

        waitForStart();
        while(opModeIsActive()) {
            telemetry.addData("red", robot.colour.red());
            telemetry.addData("green", robot.colour.green());
            telemetry.addData("blue", robot.colour.blue());
            telemetry.addData("light value", robot.colour.alpha());
            telemetry.update();
        }
    }
}
