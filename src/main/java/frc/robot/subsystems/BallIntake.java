package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.RobotMap;

/**
 * Class BallIntake is the roller intake for the robot
 * - Extends and retracts system
 * - Toggles rollers
 */
public class BallIntake extends Subsystem{
    // Motor for the intake
    private VictorSPX intake; 
    
    // Servo for extending the subsystem
    private VictorSPX extender;
    private boolean isExtended;

    /**
     * Creates the subsystem
     */
    public BallIntake(){
        intake = new VictorSPX(RobotMap.INTAKE_CHANNEL);
        extender = new VictorSPX(RobotMap.EXTENDER_CHANNEL);
    }

    /** 
     * Sets the default command
     */
    @Override
    protected void initDefaultCommand() {
        // TODO: setDefaultCommand(.....);
    }

    /**
     * Turns the intake system on after it is extended
     */
    public void activateIntake(){
        if(isExtended)
            intake.set(ControlMode.PercentOutput, RobotMap.INTAKE_SPEED);
    }

    /**
     * Deactivates the intake motor
     */
    public void deactivateIntake(){
        intake.set(ControlMode.PercentOutput, 0);
    }

    /**
     * Extends the system
     */
    public void extend(){
        isExtended = true;
        extender.set(ControlMode.Position, RobotMap.EXTENDER_IN);
    }

    /**
     * Retracts the system 
     */
    public void retract(){
        // if(intake motor is still spinning)
            // stop intake motor
        isExtended = false;
        extender.set(ControlMode.Position, RobotMap.EXTENDER_OUT);
    }

    /**
     * For toggling w/ a switch
     * @return whether the system is extended
     */
    public boolean isExtended(){
        return isExtended;
    }
}
