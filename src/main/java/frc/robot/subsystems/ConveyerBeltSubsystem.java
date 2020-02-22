/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.ConveyerBeltCommand;


/**
 * An example subsystem. You can replace with me with your own subsystem.
 */
public class ConveyerBeltSubsystem extends Subsystem {

  VictorSPX conveyer = new VictorSPX(RobotMap.CONVEYER_BELT);
 public ConveyerBeltSubsystem (){
   
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
 public void goUp(double button) {
  conveyer.set(ControlMode.PercentOutput, button);
 }

 public void goDown(double button) {
  conveyer.set(ControlMode.PercentOutput, -button);
 }

 public void stop(double button) {
  conveyer.set(ControlMode.PercentOutput, 0);
 }

  @Override
  public void initDefaultCommand() {
    
    // Set the default command for a subsystem here.
    setDefaultCommand(new ConveyerBeltCommand());
  }
  
}