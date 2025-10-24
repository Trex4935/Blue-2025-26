package main.java.frc.robot.subsystems;

import java.nio.channels.WritePendingException;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    public WPI_TalonSRX motor1;
    public WPI_TalonSRX motor2;
    public WPI_TalonSRX motor3;
    public WPI_TalonSRX motor4;
    public WPI_TalonSRX motor5;
    public WPI_TalonSRX motor6;
    public WPI_TalonSRX motor7;
    public WPI_TalonSRX motor8;

    public Drivetrain() {
        motor1 = new WPI_TalonSRX(11);
        motor2 = new WPI_TalonSRX(12);
        motor3 = new WPI_TalonSRX(13);
        motor4 = new WPI_TalonSRX(14);
        motor5 = new WPI_TalonSRX(21);
        motor6 = new WPI_TalonSRX(22);
        motor7 = new WPI_TalonSRX(23);
        motor8 = new WPI_TalonSRX(24);

    }

    public void stopMotor () {
        motor1.stopMotor(); 
        motor2.stopMotor();
        motor3.stopMotor();
        motor4.stopMotor();
        motor5.stopMotor();
        motor6.stopMotor();
        motor7.stopMotor();
        motor8.stopMotor();
    
    }

    public void speed () {
        motor1.setSpeed(0.5);
        motor2.setSpeed(0.5);
        motor3.setSpeed(0.5);
        motor4.setSpeed(0.5);
        motor5.setSpeed(0.5);
        motor6.setSpeed(0.5);
        motor7.setSpeed(0.5);
        motor8.setSpeed(0.5);
        
    }

    public void 

}
