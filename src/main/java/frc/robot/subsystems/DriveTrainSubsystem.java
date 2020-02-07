/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveTrainCommand;

/**
 * An example subsystem. You can replace with me with your own subsystem.
 */
public class DriveTrainSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  VictorSPX LeftVictor1 = new VictorSPX(RobotMap.LEFT_MOTOR1_ID);
  VictorSPX LeftVictor2 = new VictorSPX(RobotMap.LEFT_MOTOR2_ID);
  VictorSPX RightVictor1 = new VictorSPX(RobotMap.RIGHT_MOTOR1_ID);
  VictorSPX RightVictor2 = new VictorSPX(RobotMap.RIGHT_MOTOR2_ID);

  public void teleopDrive() {
    LeftVictor2.follow(LeftVictor1);
    RightVictor2.follow(RightVictor1);

  }
  //put methods for controlling this subsystem
  //here. Coall these from commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveTrainCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void TeleopDrive(double left, double right){
    LeftVictor1.set(ControlMode.PercentOutput, left);
    RightVictor1.set(ControlMode.PercentOutput, right);
  }
  public void Stop(){
    LeftVictor1.set(ControlMode.PercentOutput, 0);
    RightVictor1.set(ControlMode.PercentOutput, 0);
  }
}