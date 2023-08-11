package org.firstinspires.ftc.teamcode;



import com.qualcomm.robotcore.hardware.ColorSensor;




public class hwMap {
    public ColorSensor colour;
    com.qualcomm.robotcore.hardware.HardwareMap hwMap;

    public void init(com.qualcomm.robotcore.hardware.HardwareMap robot) {
        hwMap = robot;

        colour = hwMap.colorSensor.get("CS");
    }

}

