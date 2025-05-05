package org.firstinspires.ftc.teamcode.TRAINING;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Hello_World extends OpMode {
    @Override
    public void init() {
        double pi = Math.PI;
        telemetry.addData("number", pi + "degrees");
        boolean does_robot_suck = false;
    }

    @Override
    public void loop() {

    }
}
