package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.RobotMap;
import frc.robot.commands.ShooterCommand;

/**
 * class for shooter
 */
public class ShooterSubsystem extends Subsystem{
    // motors
    private VictorSPX shooterLeft = new VictorSPX(RobotMap.SHOOTER_LEFT);
    private VictorSPX shooterRight = new VictorSPX(RobotMap.SHOOTER_RIGHT);
    public ShooterSubsystem(){

    }

    public void shoot(){
        shooterLeft.set(ControlMode.PercentOutput, -1);
        shooterRight.set(ControlMode.PercentOutput, 1); 
    }

    public void stop(){
        shooterLeft.set(ControlMode.PercentOutput, 0);
        shooterRight.set(ControlMode.PercentOutput, 0);
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new ShooterCommand());
    }

}