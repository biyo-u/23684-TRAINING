package org.firstinspires.ftc.teamcode.TRAINING;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Servo and Motor Test")
public class Button_PressTest extends OpMode {
    public DcMotor motor;
    public Servo servo;

    @Override
    public void init() {
        this.motor = hardwareMap.get(DcMotor.class, "fridge");
        this.servo = hardwareMap.get(Servo.class, "dishwasher");
        this.motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    @Override
    public void loop() {
        // TODO FOR CODING STUDENTS: make this move forward AND return back!!
        if (gamepad1.a) {
            motor.setPower(1); // todo for biyo: why isnt this working lol????
        } else if (gamepad1.b) {
            servo.setPosition(1);
        }
        telemetry.addData("Motor Position", motor.getCurrentPosition());
        telemetry.addData("Servo Position", servo.getPosition());
    }
}
