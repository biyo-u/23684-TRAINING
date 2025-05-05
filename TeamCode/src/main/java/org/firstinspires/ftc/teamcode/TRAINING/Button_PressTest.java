package org.firstinspires.ftc.teamcode.TRAINING;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Button_PressTest extends OpMode {
    public DcMotor motor1;
    private DcMotor motor2;

    public Button_PressTest(DcMotor motor, DcMotor motorsecond) {
        this.motor1 = motor;
        this.motor2 = motorsecond;
    }

    @Override
    public void init() {
        DcMotor motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    public void add (double a, double b) {
       // return a + b;
    }

    @Override
    public void loop() {
        // comment text here
        if (gamepad1.a) {
            motor1.setPower(1);
        }
        telemetry.addData("Motor Position", motor1.getCurrentPosition());
    }
}
