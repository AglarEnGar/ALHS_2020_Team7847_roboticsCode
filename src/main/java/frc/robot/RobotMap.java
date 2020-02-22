/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.

  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
//drivetrain motors
  public static VictorSPX leftMotor1;
  public static VictorSPX leftMotor2;
  public static VictorSPX rightMotor1;
  public static VictorSPX rightMotor2;
  //drivetrain motor id's
  public static int LEFT_MOTOR1_ID = 1;
  public static int LEFT_MOTOR2_ID = 2;
  public static int RIGHT_MOTOR1_ID = 3;
  public static int RIGHT_MOTOR2_ID = 4;
  
  //public static Spark shooter1;

  // ball intake motor/servo channels 
  public static int CONVEYER_BELT = 6; 

  public static int INTAKE = 5;

  public static int SHOOTER_LEFT = 7;
  public static int SHOOTER_RIGHT = 8;

  // ball intake constants
 // 0-1

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
