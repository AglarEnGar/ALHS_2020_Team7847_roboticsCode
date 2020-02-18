package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.IntakeCommand;

public class IntakeSubsystem extends Subsystem {
    private VictorSPX intake = new VictorSPX(RobotMap.INTAKE);
    public IntakeSubsystem(){

    }

    public void start(){
        intake.set(ControlMode.PercentOutput, 1);
    }

    public void stop(){
        intake.set(ControlMode.PercentOutput, 0);
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new IntakeCommand());
    }
}